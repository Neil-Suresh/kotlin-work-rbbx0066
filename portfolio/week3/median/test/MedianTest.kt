// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf<Float>())
        }
    }

    // Write four more tests here
    "median when size=1"{
        val data = listOf(8.7f)
        median(data) shouldBe (8.7f plusOrMinus tolerance)
    }

    "median when size=2"{
        val data = listOf(10.0f, 2.0f)
        median(data) shouldBe (6.0f plusOrMinus tolerance)
    }

    "median when size=3" {
        val data = listOf(9.0f, 1.0f, 5.0f)
        median(data) shouldBe (5.0f plusOrMinus tolerance)
    }

    "median when size=4" {
        val data = listOf(2.0f, 4.0f, 6.0f, 8.0f)
        median(data) shouldBe (5.0f plusOrMinus tolerance)
    }
})
