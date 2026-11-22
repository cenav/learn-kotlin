package colecciones

fun main() {
    val notas = listOf(15, 8, 12, 10, 17)
    var mayor = notas[0]
    for (nota in notas) {
        if (nota > mayor) {
            mayor = nota
        }
    }
    println(mayor)
}