package bucles

fun main() {
    for (numero in 1..10) {
        if (numero % 3 == 0) {
            continue
        }
        println(numero)
    }
}