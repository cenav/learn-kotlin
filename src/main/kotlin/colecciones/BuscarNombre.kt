package colecciones

fun main() {
    val nombres = listOf("Ana", "Luis", "Marta")
    val buscando = "Luis"

    if (buscando in nombres) {
        println("Nombre encontrado")
    } else {
        println("Nombre ausente")
    }
}