package data

/**
 * Data class representing a Candidate.
 *
 * @property econ The economic position of the candidate.
 * @property social The social position of the candidate.
 * @property percentLiked The percentage of people who liked the candidate in primaries.
 * @property secondaryPercentLiked The percentage of people who liked the candidate in secondaries.
 */
data class Candidate(val econ: Int, val social: Int, val percentLiked: Percentage, val secondaryPercentLiked: Percentage) {
  override fun toString(): String {
    return "Candidate(econ=$econ, social=$social, percentLiked=${percentLiked}, secondaryPercentLiked=$secondaryPercentLiked)"
  }
}
