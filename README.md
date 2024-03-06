import java.util.function.BooleanSupplier

    fun main(args: Array<String>) {
    //Tipos numericos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_54_775_807
    //Tipos numericos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14 
    //Tipo caractere
    val char: Char = '?' // outros exemplos...'1','g',' '
    //tipo boolean
    val boolean:Boolean = true // ou false
    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(214748368 is Long)
    println(1.0 is Double)
    //Tudo e objeto
    println(10.dec())
    }
    
  package fundamentos
  fun main(args: Array<String>){
  var a: Int
  var b = 2//Tipos inferidos
  a = 10
  print(a+b)
  }

  package fundamentos
  fun main(args:Array<String>){
imprimirSoma(4, 5)
}
fun imprimirSoma(a: Int, b: Int){
println(a + b)
}


package fundamentos
fun main(args:Array<String>){
println(soma(2,3))
print5ln(soma(11))
}
fun soma(a:Int, b:Int = 1):Int{
return a + b
}


package fundamnetos
fun main(args:Array<String){
val aprovados = listOf("João","Maria","Pedro")
print("O primeiro colocado foi ${aprovados[0]}")
}

  package fundamentos
  fun main(args:Array<String>){
val bomHumor = true
print("Hoje estou ${if(bomHumor) "Feliz" else "chateado"}")
}


    package fundamnetos
    fun main(args:Array<String>){
var a:Int = 33.dec()
var b:String = a.toString()
println("Int: $a")
println("Primeiro char da string b é: ${b.first()} ")
}


pckage fundamentos.controles
fun main(args: Array<String>){
val nota : Double = 8.3
if(ta >=7.0) {
println("Aprovado")}
}


package fundamentos.controles
fun main(args: Array<String>){
val nota : Double = 6.9
if (nota>=7.0){
println("Aprovado!!")
} else{
println("Reprovado!!")}
}

package fundamnetos.controles
fun main(args:Array<String>){
val num1: Int = 2
val num2: Int = 3
val maiorValor = if (num1> num2){
println("Processando...")
num1
}else{
println("Processando...")
num2
}
println("O maior valor é $maiorValor")
}


package fundamentos
fun main(args:Array<String>){
val nota = 9
//usando operador range
if(nota in 9 .. 10){
println("Fantastico")
} else if (nota i n 7..8){
println("Parabens")
} else if(nota in 4 ..6){
println("Tem como recuperar")
} else if(nota in 0..3){
println("Te vejo no proximo ano")
} else {
println("Nota invalida")}
}


package fundamentos.controles
fun min(args:Array<String>){
val nota = 4
when(nota){
10,9-> print("Fantastico")
8,7-> print("Parabens")
6, 5, 4-> print("Tem como recuperar")
in 3 .. 0 ->print ("Te vejo no proximo semestre")
else ->print("Nota invalida")
}
}


package fundamentos.controles
fun main(args:Array<String>){
var opcao: Int = 0
while(opcao != -1){
val line = readLine() ?: 0
println("Voce escolheu a opcao $opcao")
}
println("Ate a proxima")
}
package fundamentos.controles
fun main(args:Array<String>){
var contador : Int = 1
while(contador <= 10){
println(contador)
contador++
}
}


package fundamnetos.controles
fun main(args:Array<String>){
for(i in 10 dowTo 1 ){
println("i = $i")}
}


package fundamentos.controles
fun main(args: Array<String>)
{
for(i in 0 ..100 step 5){
println(i)
}
for(i in 100 downTo 0 step 5){
println(i)
}
}


package fundamentos.controles
fun main(args:Array<String>){
val alunos = arrayListOf("Andre", "Carla", "Marcos")
for((indice, aluno) in alunos.withIndex()) {
println("$indice - $aluno \n"
}
}


package fundamentos.controles
fun main(args:Array<String>) {
for (i in 1 .. 10){
if(i == 5){
break
}
println("Atual: $i")
}
}

package fundamentos.controles
fun main(args:Array<String>){
loop@for (i in 1 .. 15){
for (j in 1 .. 15){
if( i == 2 && j == 9) break@loop
println("$i $j")
}
}
println("Fim")
}

package funcoes
inline fun trasacao(funcao: () -> Unit) {
println("abrindo transação...")
try{
funcao()
}finally{
println("fechando transação")
}
}
fun main(args:Array<String>){
transacao{
println("Executando SQL 1...") 
println("Executando SQL 2...")
println("Executando SQL 3...")
}
}

package funcoes 
inline fun<T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
println("Entrando no metodo $nomeFuncao...")
try{
return funcao()
}finally{
println("Metodo $nomeFuncao finalizado...")
}
}
fun somar(a:Int, b:Int): Int {
return a + b
}
fun main(args:Array<String>){
val resultado = executarComLog( "somar"){
somar (4, 5)
}
println(resultado)
}

package funcoes
fun main(args: Array<String>){
print("O menor valor é ${min(3, 4)}")
}
fun min(a: Int, b:Int): Int {
return if (a < b) a else b 
}
