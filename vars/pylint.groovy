import buildStatus
import groovy.json.JsonBuilder

def call(){
  def returnValues = [] as ArrayList
  PYTHONPATH = "${env.workspace}"
  dir("${PYTHONPATH}"){
    sh 'docker rmi -f pylint_image'
    sh "docker build -t pylint_image -f pylint.Dockerfile . --label 'ci-docker-build=true'"
    sh 'docker run --rm -it -v ${PWD}:/code pylint_image'
    sh 'cat pylint.log'
    def pylint_summary = recordIssues(
      tool: pyLint(name : 'pylint Error', pattern:'pylint.log'), 
      enabledForFailure: true,
      unstableTotalAll: 1000,
    )
    returnValues << 'pylint'
    if (currentBuild.getCurrentResult()  != "SUCCESS"){
      returnValues << false
    } else {
      returnValues << true
    }
    returnValues << pylint_summary
  }
  returnValues
}
