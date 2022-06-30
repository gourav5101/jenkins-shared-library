package net.my.jenkins.workflow
import com.cloudbees.groovy.cps.NonCPS
import groovy.json.JsonBuilder

def call(ArrayList buildStatuses){
  def COMMITID = sh (returnStdout: true, script: "git rev-parse HEAD").trim()
  def buildStatusJson = new JsonBuilder ( buildStatuses ).toPrettyString
  /*sh "aws ssm-put-parameter \
    -- name '/my_build/${COMMITID}' \
    -- type 'String' \
    -- value '${buildStatusJson}' \
    --overwrite \
    --region us-west-2 \
    --profile staging"
    */
}