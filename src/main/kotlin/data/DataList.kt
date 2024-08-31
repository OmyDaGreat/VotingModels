package data

val originalData =
  listOf(
    Election(
      listOf(
        Candidate(
          -10,
          -10,
          50.pct,
          25.pct,
        ), // Lib Left candidate with 50% of the votes and 25% of the secondary votes
        Candidate(
          0,
          -10,
          15.pct,
          25.pct,
        ), // Lib Center candidate with 15% of the votes and 25% of the secondary votes
        Candidate(
          10,
          0,
          35.pct,
          50.pct,
        ), // Center Right candidate with 35% of the votes and 50% of the secondary votes
      ),
      0, // The winner is the Lib Left candidate with 50% of the votes and 25% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          -10,
          50.pct,
          0.pct,
        ), // Lib Left candidate with 50% of the votes and 0% of the secondary votes
        Candidate(
          0,
          -10,
          15.pct,
          50.pct,
        ), // Lib Center candidate with 15% of the votes and 50% of the secondary votes
        Candidate(
          10,
          0,
          35.pct,
          50.pct,
        ), // Center Right candidate with 35% of the votes and 50% of the secondary votes
      ),
      0, // The winner is the Center Right candidate with 35% of the votes and 50% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          10,
          -10,
          35.pct,
          50.pct,
        ), // Lib Right candidate with 35% of the votes and 50% of the secondary votes
        Candidate(
          0,
          -10,
          50.pct,
          15.pct,
        ), // Lib Center candidate with 50% of the votes and 15% of the secondary votes
        Candidate(
          -10,
          0,
          15.pct,
          35.pct,
        ), // Center Left candidate with 15% of the votes and 35% of the secondary votes
      ),
      1, // The winner is the Lib Center candidate with 50% of the votes and 15% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          10,
          0,
          50.pct,
          10.pct,
        ), // Center Right candidate with 50% of the votes and 10% of the secondary votes
        Candidate(
          0,
          0,
          10.pct,
          60.pct,
        ), // Center candidate with 10% of the votes and 60% of the secondary votes
        Candidate(
          -10,
          0,
          40.pct,
          30.pct,
        ), // Center Left candidate with 40% of the votes and 30% of the secondary votes
      ),
      1, // The winner is the Center candidate with 10% of the votes and 60% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          0,
          15.pct,
          75.pct,
        ), // Center Left candidate with 15% of the votes and 75% of the secondary votes
        Candidate(
          10,
          -10,
          35.pct,
          12.5.pct,
        ), // Lib Right candidate with 35% of the votes and 12.5% of the secondary votes
        Candidate(
          0,
          -10,
          50.pct,
          12.5.pct,
        ), // Lib Center candidate with 50% of the votes and 12.5% of the secondary votes
      ),
      2, // The winner is the Lib Center candidate with 50% of the votes and 12.5% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          3,
          25.pct,
          50.pct,
        ), // Slightly Auth Left candidate with 25% of the votes and 50% of the secondary votes
        Candidate(
          -10,
          4,
          25.pct,
          50.pct,
        ), // Slightly More Auth Left candidate with 25% of the votes and 50% of the secondary votes
        Candidate(
          10,
          5,
          50.pct,
          0.pct,
        ), // Slightly More Auth Right candidate with 50% of the votes and 0% of the secondary votes
      ),
      2, // The winner is the Slightly More Auth Right candidate with 50% of the votes and 0% of the
      // secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          -10,
          50.pct,
          25.pct,
        ), // Lib Left candidate with 50% of the votes and 25% of the secondary votes
        Candidate(
          0,
          -10,
          15.pct,
          25.pct,
        ), // Lib Center candidate with 15% of the votes and 25% of the secondary votes
        Candidate(
          10,
          0,
          35.pct,
          50.pct,
        ), // Center Right candidate with 35% of the votes and 50% of the secondary votes
      ),
      0, // The winner is the Lib Left candidate with 50% of the votes and 25% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          -10,
          50.pct,
          0.pct,
        ), // Lib Left candidate with 50% of the votes and 0% of the secondary votes
        Candidate(
          0,
          -10,
          15.pct,
          50.pct,
        ), // Lib Center candidate with 15% of the votes and 50% of the secondary votes
        Candidate(
          10,
          0,
          35.pct,
          50.pct,
        ), // Center Right candidate with 35% of the votes and 50% of the secondary votes
      ),
      0, // The winner is the Center Right candidate with 35% of the votes and 50% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          10,
          -10,
          35.pct,
          50.pct,
        ), // Lib Right candidate with 35% of the votes and 50% of the secondary votes
        Candidate(
          0,
          -10,
          50.pct,
          15.pct,
        ), // Lib Center candidate with 50% of the votes and 15% of the secondary votes
        Candidate(
          -10,
          0,
          15.pct,
          35.pct,
        ), // Center Left candidate with 15% of the votes and 35% of the secondary votes
      ),
      1, // The winner is the Lib Center candidate with 50% of the votes and 15% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          10,
          0,
          50.pct,
          10.pct,
        ), // Center Right candidate with 50% of the votes and 10% of the secondary votes
        Candidate(
          0,
          0,
          10.pct,
          60.pct,
        ), // Center candidate with 10% of the votes and 60% of the secondary votes
        Candidate(
          -10,
          0,
          40.pct,
          30.pct,
        ), // Center Left candidate with 40% of the votes and 30% of the secondary votes
      ),
      1, // The winner is the Center candidate with 10% of the votes and 60% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          0,
          15.pct,
          75.pct,
        ), // Center Left candidate with 15% of the votes and 75% of the secondary votes
        Candidate(
          10,
          -10,
          35.pct,
          12.5.pct,
        ), // Lib Right candidate with 35% of the votes and 12.5% of the secondary votes
        Candidate(
          0,
          -10,
          50.pct,
          12.5.pct,
        ), // Lib Center candidate with 50% of the votes and 12.5% of the secondary votes
      ),
      2, // The winner is the Lib Center candidate with 50% of the votes and 12.5% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          3,
          25.pct,
          50.pct,
        ), // Slightly Auth Left candidate with 25% of the votes and 50% of the secondary votes
        Candidate(
          -10,
          4,
          25.pct,
          50.pct,
        ), // Slightly More Auth Left candidate with 25% of the votes and 50% of the secondary votes
        Candidate(
          10,
          5,
          50.pct,
          0.pct,
        ), // Slightly More Auth Right candidate with 50% of the votes and 0% of the secondary votes
      ),
      2, // The winner is the Slightly More Auth Right candidate with 50% of the votes and 0% of the
      // secondary votes
    ),
    // Additional data
    Election(
      listOf(
        Candidate(
          -5,
          -5,
          45.pct,
          30.pct,
        ), // Lib Left candidate with 45% of the votes and 30% of the secondary votes
        Candidate(
          5,
          -5,
          30.pct,
          45.pct,
        ), // Lib Center candidate with 30% of the votes and 45% of the secondary votes
        Candidate(
          10,
          5,
          25.pct,
          25.pct,
        ), // Center Right candidate with 25% of the votes and 25% of the secondary votes
      ),
      0, // The winner is the Lib Left candidate with 45% of the votes and 30% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -10,
          10,
          40.pct,
          20.pct,
        ), // Auth Left candidate with 40% of the votes and 20% of the secondary votes
        Candidate(
          0,
          0,
          20.pct,
          40.pct,
        ), // Center candidate with 20% of the votes and 40% of the secondary votes
        Candidate(
          10,
          -10,
          40.pct,
          40.pct,
        ), // Lib Right candidate with 40% of the votes and 40% of the secondary votes
      ),
      2, // The winner is the Lib Right candidate with 40% of the votes and 40% of the secondary
      // votes
    ),
    Election(
      listOf(
        Candidate(
          -5,
          5,
          35.pct,
          35.pct,
        ), // Center Left candidate with 35% of the votes and 35% of the secondary votes
        Candidate(
          5,
          -5,
          35.pct,
          30.pct,
        ), // Center Right candidate with 35% of the votes and 35% of the secondary votes
        Candidate(
          0,
          0,
          30.pct,
          35.pct,
        ), // Center candidate with 30% of the votes and 30% of the secondary votes
      ),
      2, // The winner is the Center candidate with 30% of the votes and 30% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -7,
          -3,
          47.pct,
          33.pct,
        ), // Lib Left candidate with 47% of the votes and 33% of the secondary votes
        Candidate(
          3,
          -7,
          28.pct,
          47.pct,
        ), // Lib Center candidate with 28% of the votes and 47% of the secondary votes
        Candidate(
          8,
          2,
          25.pct,
          20.pct,
        ), // Center Right candidate with 25% of the votes and 20% of the secondary votes
      ),
      0, // The winner is the Lib Left candidate with 47% of the votes and 33% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -9,
          9,
          42.pct,
          22.pct,
        ), // Auth Left candidate with 42% of the votes and 22% of the secondary votes
        Candidate(
          1,
          1,
          21.pct,
          42.pct,
        ), // Center candidate with 21% of the votes and 42% of the secondary votes
        Candidate(
          9,
          -9,
          37.pct,
          36.pct,
        ), // Lib Right candidate with 37% of the votes and 36% of the secondary votes
      ),
      1, // The winner is the Center candidate with 37% of the votes and 36% of the secondary votes
    ),
    Election(
      listOf(
        Candidate(
          -6,
          6,
          33.pct,
          33.pct,
        ), // Auth Left candidate with 33% of the votes and 33% of the secondary votes
        Candidate(
          4,
          -6,
          34.pct,
          32.pct,
        ), // Lib Slightly Right candidate with 34% of the votes and 32% of the secondary votes
        Candidate(
          2,
          2,
          33.pct,
          35.pct,
        ), // Center candidate with 33% of the votes and 35% of the secondary votes
      ),
      1, // The winner is the Lib Slightly Right candidate with 34% of the votes and 32% of the
      // secondary votes
    ),
  )

fun <T> List<T>.permutations(): List<List<T>> {
  if (size == 1) return listOf(this)
  val perms = mutableListOf<List<T>>()
  val toInsert = first()
  for (perm in drop(1).permutations()) {
    for (i in perm.indices + 1) {
      val newPerm = perm.toMutableList().apply { add(i, toInsert) }
      perms.add(newPerm)
    }
  }
  return perms
}

fun generateElectionsIncludingOriginal(candidates: List<Candidate>): List<Election> {
  val permutations = candidates.permutations()
  val originalElection =
    Election(candidates, candidates.indexOf(candidates.maxByOrNull { it.percentLiked.value }!!))
  val permutedElections =
    permutations.map { perm ->
      val resultIndex = perm.indexOf(perm.maxByOrNull { it.percentLiked.value }!!)
      Election(perm, resultIndex)
    }
  return listOf(originalElection) + permutedElections
}

val data = originalData.flatMap { generateElectionsIncludingOriginal(it.candidates) }
