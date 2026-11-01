import kotlin.math.PI

// Task 12.4.1: Circle class
class Circle (val centre : Point, val radius : Double){
    init {
        require(radius > 0) { "Radius must be positive." }
    }
    fun ar() = PI * radius * radius
    fun peri() = 2* PI * radius
    fun show(){
        println(ar())
        println(peri())
    }
}
