package condicionales

fun main() {
    val temperatura = 20

    val clima = when {
        temperatura < 15 -> "Frío"
        temperatura < 25 -> "Templado"
        else -> "Calor"
    }

    println(clima)
}