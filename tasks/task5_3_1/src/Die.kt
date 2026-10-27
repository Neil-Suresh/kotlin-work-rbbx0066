// Task 5.1.2: rollDie() function
package rollit
import kotlin.random.Random

fun rollDie() {
        val sides = 6
        println("Rolling a $sides sided die")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
