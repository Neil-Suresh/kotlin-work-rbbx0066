// Task 12.5.2: demo program for class with custom getter]
import kotlinx.datetime.LocalDate

fun main(){

    var n = "Alex"
    val local = LocalDate( 2026,  11,  2)
    val p =Person(n, local)
    println(p.name)
}