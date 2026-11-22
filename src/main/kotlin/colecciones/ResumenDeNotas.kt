package colecciones

fun main() {
    val notas = listOf(15, 8, 12, 10, 17)
    var suma = 0
    var mayor = notas[0]
    var menor = notas[0]
    val aprobados = mutableListOf<Int>()
    for (nota in notas) {
        suma += nota
        if (nota > mayor) {
            mayor = nota
        }
        if (nota < menor) {
            menor = nota
        }
        if (nota >= 11) {
            aprobados.add(nota)
        }
    }
    val promedio = suma.toDouble() / notas.size
    println(suma)
    println(mayor)
    println(menor)
    println(promedio)
    println(aprobados)
    println(aprobados.size)
}