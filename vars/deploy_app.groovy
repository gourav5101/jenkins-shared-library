import buildStatus
import groovy.json.JsonBuilder

def call(){
  echo "${env.json}"
    echo 'abc'
    echo json
    echo 'xyz'
    echo env.json
  //buildStatuses << new buildStatus ( test_name: 'pytest', status: true )
}
