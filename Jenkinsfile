pipeline{
    
    agent { label "master" }
    
    environment {
        IS_JENKINS_MODE= "true"
        GIT_REPO = "https://github.com/mridujune28/mridu-project1.git"
        GIT_CREDENTIALS = "mridujune28@gmail.com"
        CI = "true"
    }

stages {
    stage("dev") {
    }
    
    stage("test") {
    }
}

def notifyBuild(String buildStatus = 'started') {
    buildStatus = buildStatus ?: 'successful'
}
}
    
