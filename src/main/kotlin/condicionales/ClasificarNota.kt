package condicionales

fun main() {
    val nota = 16

    val calificacion = when (nota) {
        in 18..20 -> "Excelente"
        in 14..17 -> "Bueno"
        in 11..13 -> "Aprobado"
        in 0..10 -> "Desaprobado"
        else -> "Nota inválida"
    }

    println(calificacion)
}