package colecciones

fun main() {
    val notas = listOf(15, 8, 12, 10, 17)
    var aprobados = 0
    for (nota in notas) {
        if (nota >= 11) {
            aprobados++
        }
    }
    println(aprobados)
}