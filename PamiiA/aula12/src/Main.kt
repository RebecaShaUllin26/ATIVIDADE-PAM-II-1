//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package fundamnetos.controles
fun main(args: Array<String>) {
    val nota  = 4
    when(nota){
        10,9 -> print("fantastico")
        8, 7 -> print("parabens")
        6, 5 -> print("tem como recuperar")
        in 3 .. 0 -> print("te vejo no proximo ano")
        else -> print("nota invalida")
    }
}