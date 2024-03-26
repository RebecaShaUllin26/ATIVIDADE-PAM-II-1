//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package funcoes
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("entrando no metodo $nomeFuncao...")
    try{
        return funcao()
    } finally{
        println("metodo $nomeFuncao finalizado...")
    }
}
fun somar(a: Int, b: Int): Int {
    return  a + b
}
fun main(args: Array<String>) {
   val resultado = executarComLog("somar"){
       somar( 4,5)
   }
    println(resultado)
}