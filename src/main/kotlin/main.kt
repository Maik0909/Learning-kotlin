import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(squareRoot(10.63))
}

val squareRoot: (Double) -> Double = { sqrt(it) }
//val squareRoot: (Double) -> Double = { it.pow(0.5) }