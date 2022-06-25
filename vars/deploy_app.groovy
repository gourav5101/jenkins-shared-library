import buildStatus
import groovy.json.JsonBuilder

def call(){
  echo 'deploy_app'
  echo "${env.json}"
  //buildStatuses << new buildStatus ( test_name: 'pytest', status: true )
}
