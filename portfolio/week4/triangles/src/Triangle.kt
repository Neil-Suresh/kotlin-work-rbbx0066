// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt


class Triangle(val sideA : Double, val sideB : Double, val sideC : Double ){


    init {
        require(isValidTriangle())
    }

    fun isValidTriangle(): Boolean {

        return (sideA<sideB+sideC) && (sideB<sideA+sideC) && (sideC<sideA+sideB)
    }


    val triangleArea: Double
       get(){ val s = (sideA+sideB+sideC)/2.0
        return sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
    }

    val p : Double
        get() = sideA + sideB + sideC

    val semip : Double
        get() = p/2

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}

// Add isValidTriangle() and triangleArea() functions here
fun main() {

    val t = Triangle(3.0,4.0,5.0)

    println(t.p)
    println(t.semip)
    println(t.triangleArea)
    println(t)
}

