package io.github.omydagreat

import data.data
import decisionTree.respond
import java.io.File.separator

fun main() {
  val filePath = "${System.getProperty("user.home")}${separator}VotingModels${separator}data.csv"
  respond(data, filePath)
}
