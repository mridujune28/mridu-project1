pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
          sh "export AWS_DEFAULT_REGION=us-east-2"
          sh "aws cloudformation create-stack --stack-name s3-website-bk --template-body file://s3.json --region 'us-east-2'
            }
        }
    }
}
