import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartridgeMinesAPintTest {

    private val emptyList = emptyList<String>()
    private val noPartridgeTerms = listOf("BLUE", "RED", "PINK", "GREEN")
    private val allThePartridgeTerms = listOf("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    @Test
    fun testEmptyList() {
        assertThat(PartridgeMinesAPint.of(emptyList))
            .isEqualTo("Lynn, I've pierced my foot on a spike!!")
    }

    @Test
    fun testNoPartridgeTerms() {
        assertThat(PartridgeMinesAPint.of(noPartridgeTerms))
            .isEqualTo("Lynn, I've pierced my foot on a spike!!")
    }

    @Test
    fun testSingleTerm() {
        assertThat(PartridgeMinesAPint.of(listOf("Lynn")))
            .endsWith("Pint!")
    }

    @Test
    fun testTwoTerms() {
        assertThat(PartridgeMinesAPint.of(listOf("Lynn", "PearTree")))
            .endsWith("Pint!!")
    }

    @Test
    fun testTwoLynns() {
        assertThat(PartridgeMinesAPint.of(listOf("Lynn", "Lynn")))
            .endsWith("Pint!!")
    }

    @Test
    fun testThreeTerms() {
        assertThat(PartridgeMinesAPint.of(listOf("Partridge", "PearTree", "Chat")))
            .endsWith("Pint!!!")
    }

    @Test
    fun testAllTheTerms() {
        assertThat(PartridgeMinesAPint.of(allThePartridgeTerms))
            .endsWith("Pint!!!!!!!!")
    }

    @Test
    fun testSamePartridgeTermAppearsMultipleTimes() {
        assertThat(PartridgeMinesAPint.of(listOf("PearTree", "PearTree")))
            .endsWith("Pint!!")
    }
}