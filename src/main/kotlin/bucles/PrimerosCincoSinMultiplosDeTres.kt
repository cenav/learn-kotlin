package bucles

fun main() {
    var cantidad = 0
    for (i in 1..20) {
        if (i % 3 == 0) {
            continue
        }
        println(i)
        cantidad++
        if (cantidad == 5) {
            break
        }
    }
}