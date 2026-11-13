package bucles

fun main() {
    val nombre = "Ana"
    var puntos = 10

    puntos = puntos + 5
    puntos += 1
    println("Hola, $nombre. Tienes $puntos puntos.")

    val metas = listOf(16, 18, 20, 25)

    for (meta in metas) {
        println(mensajeDeMeta(puntos, meta))
    }
}

fun mensajeDeMeta(puntos: Int, meta: Int = 18): String {
    return if (puntos >= meta) {
        "¡Alcanzaste la meta!"
    } else {
        "Te faltan ${meta - puntos} puntos"
    }
}
