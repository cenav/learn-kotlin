package condicionales

fun main() {
    val edad = 20
    val tieneInscripcion = true

    if (edad >= 18 && tieneInscripcion) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
}