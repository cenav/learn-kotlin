package colecciones

fun main() {
    val nombres = listOf("Ana", "Luis", "Marta")
    for (indice in nombres.indices) {
        println("$indice -> ${nombres[indice]}")
    }
}