package io.github.omydagreat

import data.data
import randomForest.RandomForest
import regressionTree.RegressionTree
import weka.core.WekaPackageManager
import java.io.File.separator
import java.io.PrintStream
import kotlin.collections.forEach

fun main() {
  System.setErr(
    PrintStream(
      object : java.io.OutputStream() {
        override fun write(b: Int) {
          // Do nothing
        }
      }
    )
  )
  WekaPackageManager.loadPackages(true)
  val filePath = "${System.getProperty("user.home")}${separator}VotingModels${separator}data.csv"
  data.forEach { println(it) }
  listOf(RandomForest(), RegressionTree()).forEach { it.respond(data, filePath) }
}
