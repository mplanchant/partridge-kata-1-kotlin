import io.kotlintest.matchers.endWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class PartridgeMinesAPintTest : StringSpec({

    val noPartridgeTerms = listOf("BLUE", "RED", "PINK", "GREEN")
    val allThePartridgeTerms = listOf("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    "empty list" {
        PartridgeMinesAPint.of(emptyList()) shouldBe "Lynn, I've pierced my foot on a spike!!"
    }

    "no partridge terms" {
        PartridgeMinesAPint.of(noPartridgeTerms) shouldBe "Lynn, I've pierced my foot on a spike!!"
    }

    "single partridge term" {
        PartridgeMinesAPint.of(listOf("Lynn")) should endWith("Pint!")
    }

    "two partridge terms" {
        PartridgeMinesAPint.of(listOf("Lynn", "PearTree")) should endWith("Pint!!")
    }

    "two lynns" {
        PartridgeMinesAPint.of(listOf("Lynn", "Lynn")) should endWith("Pint!!")
    }

    "three partridge terms" {
        PartridgeMinesAPint.of(listOf("Partridge", "PearTree", "Chat")) should endWith("Pint!!!")
    }

    "all the terms" {
        PartridgeMinesAPint.of(allThePartridgeTerms) should endWith("Pint!!!!!!!!")
    }

    "same partridge term appears multiple times" {
        PartridgeMinesAPint.of(listOf("PearTree", "PearTree")) should endWith("Pint!!")
    }
})