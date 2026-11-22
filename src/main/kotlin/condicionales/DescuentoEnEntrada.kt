package condicionales

fun main() {
    val esEstudiante = false
    val esAdultoMayor = true

    if (esEstudiante || esAdultoMayor) {
        println("Tiene descuento")
    } else {
        println("Precio completo")
    }

}