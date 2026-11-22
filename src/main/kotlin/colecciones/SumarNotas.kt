package colecciones

fun main() {
    val notas = listOf(15,18,12,17)
    var suma = 0
    for (nota in notas) {
        suma += nota
    }
    println(suma)
}