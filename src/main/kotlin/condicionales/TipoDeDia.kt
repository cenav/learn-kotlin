package condicionales

fun main() {
    val dia = 6

    val tipo = when (dia) {
        1, 2, 3, 4, 5 -> "Dia laboral"
        6, 7 -> "Fin de semana"
        else -> "Día desconocido"
    }

    println(tipo)
}