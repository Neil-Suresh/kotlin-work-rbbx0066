// Task 5.4.1: String extensions
package toolong
fun isTooLong(string: String): Boolean {
    if (string.length > 20) {
        return true
    }
    else{
        return false
    }
}