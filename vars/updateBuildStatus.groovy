import buildStatus
import groovy.json.JsonBuilder

def call(ArrayList buildStatuses,buildResult){
  println buildResult[0]
  println buildResult[1]
  println buildResult[2]
  buildStatuses << new buildStatus ( test_name: buildResult[0], status: buildResult[1], detail: buildResult[2] )
  println new JsonBuilder ( buildStatuses ).toPrettyString()
}