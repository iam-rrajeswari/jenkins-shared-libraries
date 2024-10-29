def call(String GitUrl,String GitBranch){
  echo" This is cloning the code"
  git url: "${GitUrl}",branch:"${GitBranch}"
  echo " Git clone is successful"
}
