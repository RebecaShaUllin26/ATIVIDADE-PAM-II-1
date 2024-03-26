//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package fundamnetos
fun main(args: Array<String>) {
    val num1: Int = 2
    val num2: Int = 3
    val maiorValor = if (num1 > num2){
        println("processando...")
        num1
    }else{
        println("processando...")
        num2
    }
    println("o maior valor é $maiorValor")
}