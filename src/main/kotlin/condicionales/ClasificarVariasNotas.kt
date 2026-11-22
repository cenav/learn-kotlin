package condicionales

fun main() {
    val notas = listOf(19, 16, 12, 8, 25)
    for (nota in notas) {
        println("$nota -> ${clasificarNota(nota)}")
    }
}

fun clasificarNota(nota: Int): String {
    return when (nota) {
        in 18..20 -> "Excelente"
        in 14..17 -> "Bueno"
        in 11..13 -> "Aprobado"
        in 0..10 -> "Desaprobado"
        else -> "Nota inválida"
    }
}