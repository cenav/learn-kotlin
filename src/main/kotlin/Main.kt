fun main() {
    val nombre = "Ana"
    var puntos = 10

    puntos = puntos + 5
    puntos += 1
    println("Hola, $nombre. Tienes $puntos puntos.")

    val metas = listOf(18, 20, 25)

    for (meta in metas) {
        println(mensajeDeMeta(puntos, meta))
    }
}