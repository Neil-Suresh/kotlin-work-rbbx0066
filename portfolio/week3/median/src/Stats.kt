import kotlin.collections.average
import kotlin.collections.maxOrNull
import kotlin.collections.minOrNull
import kotlin.collections.sorted

// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    require(data.isNotEmpty())

    val sort = data.sorted()
    val len = data.size
    val n = len/2

    return if (len % 2 !=0 ){
        sort[n]
    }
    else {
        (sort[n - 1] + sort[n]) / 2
    }
}

fun display(data: List<Float>) {
    kotlin.io.println("Minimum: ${data.minOrNull()}")
    kotlin.io.println("Maximum: ${data.maxOrNull()}")
    kotlin.io.println("Mean: ${data.average()}")
    kotlin.io.println("Median: ${median(data)}")
}
