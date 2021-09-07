// Job decription
def stages = ['dev','test','prod']
def accountlist = ['mridu-1','mridu-2']
def jenkinsjobs = ['01_roles','02_vpc','03_endpoints']
def tooljobs = ['promote_code','delete-stack']
def appname = 'vpc'
def giturl = "https://github.com/mridujune28/mridu-project1.git"
def gitcredentials = 'mridujune28@gmail.com'
def branchname = 'master'
def exceptions = ['prod/code-promoter']
def skipparams = ['01_roles']
def dxexception = ['03_endpoints']

stages {
    stage("dev") {
    }
    
    stage("test") {
    }
}

def notifyBuild(String buildStatus = 'started') {
    buildStatus = buildStatus ?: 'successful'
}
    
