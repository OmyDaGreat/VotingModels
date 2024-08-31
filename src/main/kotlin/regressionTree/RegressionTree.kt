package regressionTree

import base.applyStringToNominalFilter
import base.createCSVFile
import base.loadData
import data.Election
import weka.classifiers.trees.M5P
import weka.core.Instances

/**
 * Processes a list of elections, converts them to CSV format, and trains a Regression Tree
 * classifier.
 *
 * @param elections A list of Election objects to be processed.
 * @param csvFilePath The file path where the CSV file will be saved.
 */
fun respond(elections: List<Election>, csvFilePath: String) {
  createCSVFile(elections, csvFilePath)
  val data = loadData(csvFilePath)
  val filteredData = applyStringToNominalFilter(data)
  filteredData.setClassIndex(0)
  println(buildClassifier(filteredData))
}

private fun buildClassifier(data: Instances) =
  M5P().apply {
    buildClassifier(data)
    return this
  }
