// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main(){
    val n = " "
    val d = LocalDate(2005,5,23)
    val p = Person(n, d)
    p.name = ""
    println(p.name)
}