import javax.swing.JOptionPane

fun cifrar(mensaje:String):String {

    var mensajeCifrado:String = ""
    var contador:Int = 4

    for(i in 0 ..  2) {
        if(i == 1){
            contador = 2
        }
        for(j in i .. mensaje.length -1 step contador) {
            mensajeCifrado += mensaje[j]
        }
        contador = 4
    }

    return mensajeCifrado
}

fun main() {
    var mensaje: String = ""
    var mensajeCifrado: String = ""

    mensaje = JOptionPane.showInputDialog("Introduce el mensaje a cifrar: ").toString()
    mensajeCifrado = cifrar(mensaje)
    JOptionPane.showMessageDialog(null, "Mensaje cifrado: " + mensajeCifrado)
}