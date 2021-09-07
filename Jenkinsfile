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
        steps {
            sh '''
            curl http://jenkins-alb-2070458536.us-east-1.elb.amazonaws.com/        
            '''
        }
    }
    
    stage("test") {
        steps {
            sh '''
            curl http://jenkins-alb-2070458536.us-east-1.elb.amazonaws.com/
            '''
        }
    }
}
}
    
