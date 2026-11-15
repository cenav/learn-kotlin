package bucles

fun main() {
    for (numero in 10..30) {
        if (numero % 7 == 0) {
            println(numero)
            break
        }
    }
}