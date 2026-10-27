// Task 5.2.1: main program
import Areas.Ar
import Areas.Pr

fun main(args: Array<String>) {
    val r = args[0].toDouble()
    println("The area of this circle is: ${Ar(r)}")
    println("The perimeter of this circle is: ${Pr(r)}")


}