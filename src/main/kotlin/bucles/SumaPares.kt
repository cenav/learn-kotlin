package bucles

fun main() {
    var suma = 0
    for (numero in 2..10 step 2) {
        suma += numero
    }
    println(suma)
}