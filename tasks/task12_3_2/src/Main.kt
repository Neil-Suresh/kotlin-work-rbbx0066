// Task 12.3.2: demo of Person class with secondary constructor
fun main(){
    println("Enter your name: ")
    var name = readln()
    println("Hello $name!")
    println("Enter your DOB: ")
    var dob = readln().split("-")
    val bday = Date(
            dob[0].toInt(),
            dob[1].toInt(),
            dob[2].toInt()
        )

    println("Still single? ")
    val m = readln()
    if (m == "yeah"){
        println("damn.")
        Person(name,bday, false)
    }
    else{
        Person(name,bday,true)
    }



}