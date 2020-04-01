#!/usr/bin/env groovy
wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'xterm']) {
  sh 'something that outputs ansi colored stuff'
}
