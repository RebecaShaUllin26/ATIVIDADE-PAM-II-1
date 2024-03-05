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
println("Primeiro char da string b é ")


