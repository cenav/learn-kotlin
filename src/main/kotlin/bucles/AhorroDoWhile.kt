package bucles

fun main() {
    var ahorro = 50
    var semanas = 0
    do {
        ahorro += 15
        semanas += 1
    } while (ahorro < 50)
    println("ahorro = $ahorro")
    println("semanas = $semanas")
}