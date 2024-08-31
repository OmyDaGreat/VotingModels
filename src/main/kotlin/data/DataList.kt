package data

/** List of original election data. Each `Election` contains a list of `Candidate` objects and an index indicating the winner. */
val originalData =
  listOf(
    Election(
      listOf(
        Candidate(-10, -10, 50.pct, 25.pct), // Lib Left: 50% votes, 25% secondary
        Candidate(0, -10, 15.pct, 25.pct), // Lib Center: 15% votes, 25% secondary
        Candidate(10, 0, 35.pct, 50.pct), // Center Right: 35% votes, 50% secondary
      ),
      0, // Winner: Lib Left
    ),
    Election(
      listOf(
        Candidate(-10, -10, 50.pct, 0.pct), // Lib Left: 50% votes, 0% secondary
        Candidate(0, -10, 15.pct, 50.pct), // Lib Center: 15% votes, 50% secondary
        Candidate(10, 0, 35.pct, 50.pct), // Center Right: 35% votes, 50% secondary
      ),
      0, // Winner: Center Right
    ),
    Election(
      listOf(
        Candidate(10, -10, 35.pct, 50.pct), // Lib Right: 35% votes, 50% secondary
        Candidate(0, -10, 50.pct, 15.pct), // Lib Center: 50% votes, 15% secondary
        Candidate(-10, 0, 15.pct, 35.pct), // Center Left: 15% votes, 35% secondary
      ),
      1, // Winner: Lib Center
    ),
    Election(
      listOf(
        Candidate(10, 0, 50.pct, 10.pct), // Center Right: 50% votes, 10% secondary
        Candidate(0, 0, 10.pct, 60.pct), // Center: 10% votes, 60% secondary
        Candidate(-10, 0, 40.pct, 30.pct), // Center Left: 40% votes, 30% secondary
      ),
      1, // Winner: Center
    ),
    Election(
      listOf(
        Candidate(-10, 0, 15.pct, 75.pct), // Center Left: 15% votes, 75% secondary
        Candidate(10, -10, 35.pct, 12.5.pct), // Lib Right: 35% votes, 12.5% secondary
        Candidate(0, -10, 50.pct, 12.5.pct), // Lib Center: 50% votes, 12.5% secondary
      ),
      2, // Winner: Lib Center
    ),
    Election(
      listOf(
        Candidate(-10, 3, 25.pct, 50.pct), // Auth Left: 25% votes, 50% secondary
        Candidate(-10, 4, 25.pct, 50.pct), // More Auth Left: 25% votes, 50% secondary
        Candidate(10, 5, 50.pct, 0.pct), // More Auth Right: 50% votes, 0% secondary
      ),
      2, // Winner: More Auth Right
    ),
    Election(
      listOf(
        Candidate(-10, -10, 50.pct, 25.pct), // Lib Left: 50% votes, 25% secondary
        Candidate(0, -10, 15.pct, 25.pct), // Lib Center: 15% votes, 25% secondary
        Candidate(10, 0, 35.pct, 50.pct), // Center Right: 35% votes, 50% secondary
      ),
      0, // Winner: Lib Left
    ),
    Election(
      listOf(
        Candidate(-10, -10, 50.pct, 0.pct), // Lib Left: 50% votes, 0% secondary
        Candidate(0, -10, 15.pct, 50.pct), // Lib Center: 15% votes, 50% secondary
        Candidate(10, 0, 35.pct, 50.pct), // Center Right: 35% votes, 50% secondary
      ),
      0, // Winner: Center Right
    ),
    Election(
      listOf(
        Candidate(10, -10, 35.pct, 50.pct), // Lib Right: 35% votes, 50% secondary
        Candidate(0, -10, 50.pct, 15.pct), // Lib Center: 50% votes, 15% secondary
        Candidate(-10, 0, 15.pct, 35.pct), // Center Left: 15% votes, 35% secondary
      ),
      1, // Winner: Lib Center
    ),
    Election(
      listOf(
        Candidate(10, 0, 50.pct, 10.pct), // Center Right: 50% votes, 10% secondary
        Candidate(0, 0, 10.pct, 60.pct), // Center: 10% votes, 60% secondary
        Candidate(-10, 0, 40.pct, 30.pct), // Center Left: 40% votes, 30% secondary
      ),
      1, // Winner: Center
    ),
    Election(
      listOf(
        Candidate(-10, 0, 15.pct, 75.pct), // Center Left: 15% votes, 75% secondary
        Candidate(10, -10, 35.pct, 12.5.pct), // Lib Right: 35% votes, 12.5% secondary
        Candidate(0, -10, 50.pct, 12.5.pct), // Lib Center: 50% votes, 12.5% secondary
      ),
      2, // Winner: Lib Center
    ),
    Election(
      listOf(
        Candidate(-10, 3, 25.pct, 50.pct), // Auth Left: 25% votes, 50% secondary
        Candidate(-10, 4, 25.pct, 50.pct), // More Auth Left: 25% votes, 50% secondary
        Candidate(10, 5, 50.pct, 0.pct), // More Auth Right: 50% votes, 0% secondary
      ),
      2, // Winner: More Auth Right
    ),
    Election(
      listOf(
        Candidate(-5, -5, 45.pct, 30.pct), // Lib Left: 45% votes, 30% secondary
        Candidate(5, -5, 30.pct, 45.pct), // Lib Center: 30% votes, 45% secondary
        Candidate(10, 5, 25.pct, 25.pct), // Center Right: 25% votes, 25% secondary
      ),
      0, // Winner: Lib Left
    ),
    Election(
      listOf(
        Candidate(-10, 10, 40.pct, 20.pct), // Auth Left: 40% votes, 20% secondary
        Candidate(0, 0, 20.pct, 40.pct), // Center: 20% votes, 40% secondary
        Candidate(10, -10, 40.pct, 40.pct), // Lib Right: 40% votes, 40% secondary
      ),
      2, // Winner: Lib Right
    ),
    Election(
      listOf(
        Candidate(-5, 5, 35.pct, 35.pct), // Center Left: 35% votes, 35% secondary
        Candidate(5, -5, 35.pct, 30.pct), // Center Right: 35% votes, 30% secondary
        Candidate(0, 0, 30.pct, 35.pct), // Center: 30% votes, 35% secondary
      ),
      2, // Winner: Center
    ),
    Election(
      listOf(
        Candidate(-7, -3, 47.pct, 33.pct), // Lib Left: 47% votes, 33% secondary
        Candidate(3, -7, 28.pct, 47.pct), // Lib Center: 28% votes, 47% secondary
        Candidate(8, 2, 25.pct, 20.pct), // Center Right: 25% votes, 20% secondary
      ),
      0, // Winner: Lib Left
    ),
    Election(
      listOf(
        Candidate(-9, 9, 42.pct, 22.pct), // Auth Left: 42% votes, 22% secondary
        Candidate(1, 1, 21.pct, 42.pct), // Center: 21% votes, 42% secondary
        Candidate(9, -9, 37.pct, 36.pct), // Lib Right: 37% votes, 36% secondary
      ),
      1, // Winner: Center
    ),
    Election(
      listOf(
        Candidate(-6, 6, 33.pct, 33.pct), // Auth Left: 33% votes, 33% secondary
        Candidate(4, -6, 34.pct, 32.pct), // Slightly Right: 34% votes, 32% secondary
        Candidate(2, 2, 33.pct, 35.pct), // Center: 33% votes, 35% secondary
      ),
      1, // Winner: Slightly Right
    ),
  )

/** List of all generated election data including the original and all permutations. */
val data = generatePermutations(originalData)

// Function to generate all permutations of a list
fun <T> List<T>.permutations(): List<List<T>> {
  if (size <= 1) return listOf(this)
  val result = mutableListOf<List<T>>()
  val toInsert = this[0]
  for (perm in drop(1).permutations()) {
    for (i in 0..perm.size) {
      val newPerm = perm.toMutableList()
      newPerm.add(i, toInsert)
      result.add(newPerm)
    }
  }
  return result
}

// Function to generate all permutations of each election while keeping the same winner index
fun generatePermutations(elections: List<Election>): List<Election> {
  return elections.flatMap { election ->
    val winnerIndex = election.result
    election.candidates.permutations().map { permutedCandidates ->
      val newWinnerIndex = permutedCandidates.indexOf(election.candidates[winnerIndex])
      Election(permutedCandidates, newWinnerIndex)
    }
  }
}
