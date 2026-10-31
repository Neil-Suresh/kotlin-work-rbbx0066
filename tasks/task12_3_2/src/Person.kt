// Task 12.3.2: Person class with secondary con;structor
class Person(var name: String, val date: Date, var ism : Boolean)
class Date(year: Int, month: Int, day: Int) {
    val y = year
    val m = month
    val d = day
    val r = "$y-$m-$d"

}