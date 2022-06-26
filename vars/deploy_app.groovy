import buildStatus
import groovy.json.JsonBuilder

@NonCPS
def call(){
  echo 'deploy_app'
  echo "${env.json}"
  echo "${abcd}"
  //buildStatuses << new buildStatus ( test_name: 'pytest', status: true )
}
