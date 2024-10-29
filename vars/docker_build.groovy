def call(String ProjectName,String ImageTag,String DockerHubUser){
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag}
}
