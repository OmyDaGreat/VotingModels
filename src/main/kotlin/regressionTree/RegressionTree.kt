package regressionTree

import base.Classifier
import base.applyStringToNominalFilter
import base.createCSVFile
import base.loadData
import data.Election
import weka.classifiers.trees.M5P
import weka.core.Instances

class RegressionTree : Classifier {
  override fun respond(elections: List<Election>, csvFilePath: String) {
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
}
