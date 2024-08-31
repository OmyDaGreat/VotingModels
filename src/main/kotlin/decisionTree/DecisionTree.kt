package decisionTree

import data.DataPoint
import java.io.File
import weka.classifiers.trees.J48
import weka.core.Instances
import weka.core.converters.ConverterUtils.DataSource
import weka.filters.Filter
import weka.filters.unsupervised.attribute.StringToNominal

fun respond(dataPoints: List<DataPoint>, csvFilePath: String) {
  File(csvFilePath).apply {
    parentFile.mkdirs()
    createNewFile()
    writeText(convertToCSV(dataPoints))
    val data = DataSource(csvFilePath).dataSet
    val stn = StringToNominal()
    stn.setInputFormat(data)
    val newData: Instances = Filter.useFilter(data, stn)
    newData.setClassIndex(newData.numAttributes() - 1)
    J48().apply {
      buildClassifier(newData)
      println(this)
    }
  }
}

fun convertToCSV(dataPoints: List<DataPoint>): String {
  val header = buildString {
    append("result")
    dataPoints.firstOrNull()?.candidates?.forEachIndexed { index, _ ->
      append(",econ${index + 1},social${index + 1},percentLiked${index + 1}")
    }
    append("\n")
  }

  val rows =
    dataPoints.joinToString("\n") { dataPoint ->
      buildString {
        append(dataPoint.result)
        dataPoint.candidates.forEach { candidate ->
          append(",${candidate.econ},${candidate.social},${candidate.percentLiked}")
        }
      }
    }

  return header + rows
}
