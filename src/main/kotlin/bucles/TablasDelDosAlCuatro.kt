package bucles

fun main() {
    for (i in 2..4) {
        for (j in 1..10) {
            val producto = i * j
            println("$i x $j = $producto")
        }
    }
}