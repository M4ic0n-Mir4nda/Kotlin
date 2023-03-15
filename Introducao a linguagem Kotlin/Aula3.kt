fun escreve(nome:String, sNome:String, faculdade:String){   
    println("<<< $nome")    
    println("<<< $sNome")    
    println("<<< $faculdade")    
}

fun main(){       
 escreve("José","Silva","GV")
}

-------------------------------------------------

fun main() {
    var nome = "Fabio"
    imprimir(nome)
    val soma = somar(2, 3)
    imprimir("Soma: $soma")
}
// recebe uma string e não retorna nada (Unit)
fun imprimir(s: String): Unit {
	println(s)
}

// Recebe 2 inteiros e retorna uma inteiro
fun somar(a: Int, b: Int): Int {
	return a + b
}

-------------------------------------------------

fun main() {
    val numero = 5
    var fatorial = 1
    for (ordem in 1..numero) {
        fatorial *= ordem
    }
    println(fatorial)
}

----------------------------------------------------

// Comandos de repetição
fun main(){    
 for (valor in 1..10){      
     println(valor)   
 }
}

----------------------------------------------------


fun main() { 
    var nome:String? = "Fabio" 
    println("Olá $nome") 
    nome = null // OK 
    println("Olá $nome") 
    if (nome != null){ 
    println("$nome possui ${nome.length} caracteres") 
    }
}

-------------------------------------------------


fun escreve(nome:String,  sNome:String?=null, faculdade:String="Impacta"){
    if (sNome!=null){
     print(" $sNome") 
    }
    if (faculdade!=null){       
     print(" - $faculdade")    
    }
    println(" >>>") 
}

fun main(){       
escreve("José","Silva","GV")  
escreve("João","Silveira")    
escreve("Ana")    
escreve("Paula",faculdade="USP")  
}


--------------------------------------------------

fun main() {
    var i = getInteiro("5")
    println(i)
    i = getInteiro(null)
    println(i)
    i = getInteiro(null, 2)
    println(i)
}

// Função que transforma uma string num inteiro; caso a string seja nula,
// retorna 0, o valor doo argumento padrão
fun getInteiro(s: String?, padrao: Int = 0): Int {
    if (s != null) {
    return s.toInt()
    }
return padrao
}

--------------------------------------------------

fun main() {
    teste("Fabio", "Pereira", "Impacta")
    teste("Fabio")
    teste("Fabio", faculdade = "Impacta")
}

fun teste(nome: String?, sobrenome: String? = null, faculdade: String? = null) {
	println("Nome: $nome, Sobrenome: $sobrenome, Faculdade: $faculdade")
}

--------------------------------------------------

fun calcula(num1:Double, num2:Double, operacao:String){   
    var resultado:Double = 0.0
    if(operacao == "SOMAR"){
    resultado = num1+num2
    }
    else if (operacao == "SUBTRAIR"){
    resultado = num1-num2
    }else if (operacao=="MULTIPLICAR") {
    resultado = num1*num2
    }else if (operacao == "DIVIDIR"){
    resultado = num1/num2}
    print("$operacao, $resultado")
}


--------------------------------------------------

fun main(){       
var num1:Double
var num2:Double
var operacao:String
num1 = 30.0
num2 = 20.0
operacao = "SUBTRAIR"
calcula(num1, num2, operacao)
}