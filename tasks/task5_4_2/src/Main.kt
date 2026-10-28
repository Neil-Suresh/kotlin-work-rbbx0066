// Task 5.4.1: main program

val String.isTooLong: Boolean get() = this.length > 20 == true


fun main(){
    val n = "fffffffffff"
    println(n.isTooLong)
}