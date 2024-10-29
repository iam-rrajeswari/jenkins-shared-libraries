def call(String GitUrl,String GitBranch){
  echo" This is cloning the code"
  gir url: "${GitUrl}",branch:"GitBranch"
  echo " Git clone is successful"
}
