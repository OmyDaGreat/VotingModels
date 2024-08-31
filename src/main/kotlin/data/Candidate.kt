package data

data class Candidate(
  val econ: Int,
  val social: Int,
  val percentLiked: Percentage,
  val result: Boolean? = null,
)
