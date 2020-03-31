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
def info(message){
loadColors()
sh """set +x; echo -e "${CYAN}[INFO] - $message ${NC}" """
}
def info2(message){
loadColors()
sh """set +x; echo -e "${PURPLE}[INFO] -$message ${NC}" """
}
def warn(message){
loadColors()
sh """set +x; echo -e "${ON_YELLOW}[warn] -$message ${NC}" """
}
def error(message, def exception throwException){
loadColors()
sh """set +x; echo -e "${RED}[ERROR] - $message ${NC}" """
if(throwException){
throw new RuntimeException(message)
}
}
def debug(message){
loadColors()
sh """set+x; echo -e "${BLUE}[DEBUG] - $message ${NC}" """
}
