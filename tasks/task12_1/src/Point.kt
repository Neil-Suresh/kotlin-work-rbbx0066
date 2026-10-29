// Task 12.1: Point class

import kotlin.math.hypot

/*class Point constructor(x : Double, y : Double) {
    var x = x
    var y = y
}*/

class Point(var x:Double, var y:Double){
    fun distance() = hypot(x, y)
}

