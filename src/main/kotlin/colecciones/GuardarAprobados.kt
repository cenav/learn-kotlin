package colecciones

fun main() {
    val notas = listOf(15, 8, 12, 10, 17)
    val aprobadas = mutableListOf<Int>()
    for (nota in notas) {
        if (nota >= 11) {
            aprobadas.add(nota)
        }
    }
    println(aprobadas)
}