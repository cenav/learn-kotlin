package condicionales

fun main() {
    val tieneInscricion = false
    val esAdministrador = true
    val estaBloqueado = true

    if ((tieneInscricion || esAdministrador) && !estaBloqueado) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
}