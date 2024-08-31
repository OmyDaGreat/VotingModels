package io.github.omydagreat

import base.Classifier
import data.data
import randomForest.RandomForest
import regressionTree.RegressionTree
import weka.core.WekaPackageManager
import java.io.File.separator
import kotlin.collections.forEach

fun main() {
  WekaPackageManager.loadPackages(true)
  val filePath = "${System.getProperty("user.home")}${separator}VotingModels${separator}data.csv"

  val classifiers: List<Classifier> = listOf(RandomForest(), RegressionTree())
  classifiers.forEach { it.respond(data, filePath) }
}
