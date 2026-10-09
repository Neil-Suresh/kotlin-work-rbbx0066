// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()


    val s = (a + b + c)/2
    val A = s*((s-a)*(s-b)*(s-c))
    val Ar = sqrt(A)
    println("Area = %.5f".format(Ar))

}


