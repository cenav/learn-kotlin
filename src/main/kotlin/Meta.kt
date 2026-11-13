fun mensajeDeMeta(puntos: Int, meta: Int = 18): String {

    return if (puntos >= meta) {
        "Alcanzaste la meta!"
    } else {
        "Te faltan ${meta - puntos} puntos"
    }

}
