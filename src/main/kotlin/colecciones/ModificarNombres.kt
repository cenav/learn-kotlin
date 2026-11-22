package colecciones

fun main() {
    val nombres = mutableListOf("Ana", "Luis", "Marta")
    nombres[1] = "Pedro"
    nombres.remove("Ana")
    println(nombres)
}