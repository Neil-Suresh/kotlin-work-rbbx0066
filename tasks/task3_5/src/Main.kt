// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readLines
import kotlin.io.path.readText
import kotlin.io.path.writeLines
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")// Add your code here
    filePath.writeText("check check 1 2" )
    filPath.writeText("this should be a new line")
}



