// Task 12.5.4: demo program for class with a computed property
import kotlin.time.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.yearsUntil

fun main(){
    var birth = LocalDate(2005,5,23)

    class Person(var a : LocalDate){
        val age get() = birth.yearsUntil(today())
    }
    val p = Person(birth)
    println(p.age)
}