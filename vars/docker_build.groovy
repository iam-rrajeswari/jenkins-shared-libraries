def call(String dockerHubUser,String ImageTag,String PrjectName){
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
