import buildStatus
import groovy.json.JsonBuilder

def call(){
  echo 'deploy_app'
  echo "${env.json}"
  echo "${abcd}"
  //buildStatuses << new buildStatus ( test_name: 'pytest', status: true )
}
