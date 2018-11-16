object PartridgeMinesAPint {

    private val partridgeTerms = listOf(
        "Partridge",
        "PearTree",
        "Chat",
        "Dan",
        "Toblerone",
        "Lynn",
        "AlphaPapa",
        "Nomad"
    )

    fun of(terms: List<String>): String {
        val numberOfTerms = terms.count { term -> partridgeTerms.contains(term) }
        return when {
            (numberOfTerms < 1) -> "Lynn, I've pierced my foot on a spike!!"
            else -> "Mine's a Pint${"!".repeat(numberOfTerms)}"
        }
    }
}