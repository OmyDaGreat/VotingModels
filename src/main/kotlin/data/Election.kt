package data

/**
 * Election class representing an election with candidates and a result.
 *
 * @property candidates A list of Candidates.
 * @property result An integer result, deciding which of the Candidates won.
 */
data class Election(val candidates: List<Candidate>, val result: Int?)
