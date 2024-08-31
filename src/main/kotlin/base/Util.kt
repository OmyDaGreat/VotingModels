package base

import data.Election
import weka.core.Instances
import weka.core.converters.ConverterUtils.DataSource
import weka.filters.Filter
import weka.filters.unsupervised.attribute.NumericToNominal
import weka.filters.unsupervised.attribute.StringToNominal
import java.io.File

/**
 * Creates a CSV file from a list of Election objects.
 *
 * @param elections A list of Election objects to be processed.
 * @param csvFilePath The file path where the CSV file will be saved.
 */
fun createCSVFile(elections: List<Election>, csvFilePath: String) {
  File(csvFilePath).apply {
    parentFile.mkdirs()
    createNewFile()
    writeText(convertToCSV(elections))
  }
}

/**
 * Loads data from a CSV file and returns it as an Instances object.
 *
 * @param csvFilePath The file path of the CSV file to be loaded.
 * @return An Instances object containing the data from the CSV file.
 */
fun loadData(csvFilePath: String): Instances = DataSource(csvFilePath).dataSet

/**
 * Applies the StringToNominal filter to the given data.
 *
 * @param data The Instances object to be filtered.
 * @return A new Instances object with the StringToNominal filter applied.
 */
fun applyStringToNominalFilter(data: Instances): Instances {
  return StringToNominal().apply { setInputFormat(data) }.let { Filter.useFilter(data, it) }
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
      append(
        ",econ${index + 1},social${index + 1},percentLiked${index + 1},secondaryPercentLiked${index + 1}"
      )
    }
    append("\n")
  }

  val rows =
    elections.joinToString("\n") { dataPoint ->
      buildString {
        append(dataPoint.result)
        dataPoint.candidates.forEach { candidate ->
          append(
            ",${candidate.econ},${candidate.social},${candidate.percentLiked},${candidate.secondaryPercentLiked}"
          )
        }
      }
    }

  return header + rows
}

/**
 * Applies the NumericToNominal filter to the given data.
 *
 * @param data The Instances object to be filtered.
 * @return A new Instances object with the NumericToNominal filter applied.
 */
fun applyNumericToNominalFilter(data: Instances): Instances {
  return NumericToNominal()
    .apply {
      attributeIndices = "first"
      setInputFormat(data)
    }
    .let { Filter.useFilter(data, it) }
}