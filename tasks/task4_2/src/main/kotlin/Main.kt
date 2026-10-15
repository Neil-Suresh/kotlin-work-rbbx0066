// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print( """
PIZZA MENU

(a) Margherita
(b) Quattro Stagioni
(c) Seafood
(d) Hawaiian

Choose your pizza (a-d): """)

    val x = readln().lowercase()

    if(x.length == 1 && x[0] in "a".."d"  ){
    println("yea works")
} else{
        println("Invalid")
    }
}



