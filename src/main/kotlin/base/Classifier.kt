package base

import data.Election

fun interface Classifier {
  fun respond(elections: List<Election>, csvFilePath: String)
}
