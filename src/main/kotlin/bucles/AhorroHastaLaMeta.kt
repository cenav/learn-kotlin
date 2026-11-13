package bucles

fun main() {
    var ahorro = 0
    var semanas = 0

    while (ahorro < 50) {
        ahorro += 15
        semanas += 1
    }
    println("ahorro = $ahorro")
    println("semanas = $semanas")
}