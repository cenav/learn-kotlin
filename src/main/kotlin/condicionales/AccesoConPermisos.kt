package condicionales

fun main() {
    val tieneInscripcion = false
    val esAdministrador = true
    val estaBloqueado = false

    if ((tieneInscripcion || esAdministrador) && !estaBloqueado) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
}