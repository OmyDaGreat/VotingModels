package io.github.omydagreat

import data.data
import weka.core.WekaPackageManager
import java.io.File.separator

fun main() {
  WekaPackageManager.loadPackages(true)
  val filePath = "${System.getProperty("user.home")}${separator}VotingModels${separator}data.csv"
  randomForest.respond(data, filePath)
  regressionTree.respond(data, filePath)
}
