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
def info(String str) {
  if (env.TERM) {
    println("${color.green}${str}")
  } else {
    ansiColor {
      println("${color.green}${str}")
    }
  }
}
