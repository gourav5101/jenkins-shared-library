import buildStatus
import groovy.json.JsonBuilder

def call(){
    echo env.json
    echo 'abc'
    echo json
  //buildStatuses << new buildStatus ( test_name: 'pytest', status: true )
}
