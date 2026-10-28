// Task 5.1.1: main program
import Anagram.anagrams

infix fun String.anagramOf(second: String): Boolean = this.length != second.length == false


fun main(args: Array<String>) {

    if (args[1] anagramOf args[0]) {
        println("${args[0]} and ${args[1]} are anagrams!")
    }


}


