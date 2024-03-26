//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package fundanetos
fun main(args: Array<String>) {
    val nota = 9
    //usando operador range
    if (nota in 9 .. 10){
        println("fantastico")
    }else if(nota in 7 ..8){
        println("parabens")
    }else if(nota in 4 .. 6){
        println("tem como recuperar")
    }else if(nota in 0 ..3){
        println("te vejo no proximo ano")
    }else{
        println("nota invalida")
    }
}