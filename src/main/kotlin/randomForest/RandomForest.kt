package randomForest

import base.Classifier
import base.applyStringToNominalFilter
import base.createCSVFile
import base.loadData
import data.Election
import weka.classifiers.trees.RandomForest
import weka.core.Instances

class RandomForest : Classifier {
  override fun respond(elections: List<Election>, csvFilePath: String) {
    createCSVFile(elections, csvFilePath)
    val data = loadData(csvFilePath)
    val filteredData = applyStringToNominalFilter(data)
    filteredData.setClassIndex(0)
    println(buildClassifier(filteredData))
  }

  private fun buildClassifier(data: Instances) =
    RandomForest().apply {
      buildClassifier(data)
      return this
    }
}
