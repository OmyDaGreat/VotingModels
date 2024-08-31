package data

val data = listOf(
  DataPoint(
    listOf(
      Candidate(-10, -10, 50.pct),
      Candidate(0, -10, 15.pct),
      Candidate(10, 0, 35.pct)
    ), 0
  ),
  DataPoint(
    listOf(
      Candidate(10, -10, 35.pct),
      Candidate(0, -10, 50.pct),
      Candidate(-10, 0, 15.pct)
    ), 1
  ),
  DataPoint(
    listOf(
      Candidate(-10, 0, 15.pct),
      Candidate(10, -10, 35.pct),
      Candidate(0, -10, 50.pct)
    ), 2
  ),
  DataPoint(
    listOf(
      Candidate(-10, 3, 35.pct),
      Candidate(10, 4, 35.pct),
      Candidate(0, 5, 30.pct)
    ), 2
  ),
  DataPoint(
    listOf(
      Candidate(-10, 3, 35.pct),
      Candidate(10, 4, 35.pct),
      Candidate(0, 5, 30.pct)
    ), 2
  )
)