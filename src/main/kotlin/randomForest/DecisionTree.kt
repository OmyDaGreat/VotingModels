package randomForest

import data.Election
import weka.classifiers.trees.RandomForest
import weka.core.Instances
import weka.core.converters.ConverterUtils.DataSource
import weka.filters.Filter
import weka.filters.unsupervised.attribute.StringToNominal
import java.io.File

/**
 * Processes a list of elections, converts them to CSV format, and trains a Random Forest
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
  buildAndPrintRandomForestClassifier(filteredData)
}

private fun createCSVFile(elections: List<Election>, csvFilePath: String) {
  File(csvFilePath).apply {
    parentFile.mkdirs()
    createNewFile()
    writeText(convertToCSV(elections))
  }
}

private fun loadData(csvFilePath: String) = DataSource(csvFilePath).dataSet

private fun applyStringToNominalFilter(data: Instances): Instances {
  return StringToNominal().apply {
    setInputFormat(data)
  }.let {
    Filter.useFilter(data, it)
  }
}

private fun buildAndPrintRandomForestClassifier(data: Instances) {
  RandomForest().apply {
    buildClassifier(data)
    println(this)
  }
}

/**
 * Converts a list of elections to a CSV formatted string.
 *
 * @param elections A list of Election objects to be converted.
 * @return A CSV formatted string representing the elections.
 */
fun convertToCSV(elections: List<Election>): String {
  val header = buildString {
    append("result")
    elections.firstOrNull()?.candidates?.forEachIndexed { index, _ ->
      append(",econ${index + 1},social${index + 1},percentLiked${index + 1},secondaryPercentLiked${index + 1}")
    }
    append("\n")
  }

  val rows = elections.joinToString("\n") { dataPoint ->
    buildString {
      append(dataPoint.result)
      dataPoint.candidates.forEach { candidate ->
        append(",${candidate.econ},${candidate.social},${candidate.percentLiked},${candidate.secondaryPercentLiked}")
      }
    }
  }

  return header + rows
}