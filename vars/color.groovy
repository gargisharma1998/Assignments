#!/usr/bin/env groovy
def loadColors(){
   RED='\033[0;31m'
   BLUE='\033[0;34m'
   CYAN='\033[0;36m'
   GREEN='\033[0;32m'
   PURPLE='\033[0;35m'
   ON_YELLOW='\033[43m'
   NC='033[0m'
}
def jobs = hudson.model.Hudson.instance.items
jobs.each { job ->
    def has_color_wrapper = false
    job.buildWrappersList.each { wrapper ->
      if (wrapper instanceof hudson.plugins.ansicolor.AnsiColorBuildWrapper) {
        has_color_wrapper = true
        println("$job.name is already configured.")
      }
    }
    if (!has_color_wrapper) {
        println("Adding AnsiColor to $job.name")
        job.buildWrappersList.add(new hudson.plugins.ansicolor.AnsiColorBuildWrapper("xterm"));
        job.save()
    }
}
