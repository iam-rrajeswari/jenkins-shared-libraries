def call(String ProjectName,String ImageTag,String DOckerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
