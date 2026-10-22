// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val n = args[0].toInt()
    var out = 0
    for (i in 0..n) {
        if (i%2 != 0){

            out += i
            println(out)
            }
        }

    }

