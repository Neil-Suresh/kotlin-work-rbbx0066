// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main (args: Array<String>) {
    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()

    val mark= (mark1 + mark2 + mark3)/3
    val grade = when (mark) {
        in 0..39 -> println("Fail")
        in 39..69 -> println("Pass")
        in 70..100 -> println("Distinction")
        else -> println("?")
    }
}
