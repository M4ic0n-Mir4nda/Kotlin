/*
1. Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas é
maior do que 1000 ou menor do que 100. Exiba qual é a variável que está
dentro do range.
*/
fun main(){    
 	var num1:Int = 500
    var num2:Int = 99
    var num3:Int = 1001
    
    if (num1 > 1000 || num1 < 100) {
        println(num1)
    }
    
    if (num2 > 1000 || num2 < 100) {
        println(num2)
    }
    
    if (num3 > 1000 || num3 < 100) {
        println(num3)
    }
}

/*
2. Inicialize dois valores, calcule e apresente a diferença do maior pelo menor.
*/

fun main() {
    var num1: Int = 30
    var num2: Int = 50
    
    val diferenca = if (num1 > num2) {
        num1 - num2
    } else {
        num2 - num1
    }
    
    println("A diferença entre o maior e menor valor é $diferenca")
}

/*
3. Inicialize as notas dos alunos, N1, N2 e N3. Verifique se a média das três é
maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi
aprovado. Senão Inicialize uma nova nota N4 e verifique se o aluno foi
aprovado.
*/

fun main() {
    var n1:Double = 5.0
    var n2:Double = 5.0
    var n3:Double = 5.0
    val mediaFinal = (n1 + n2 + n3) / 3
    
    if (mediaFinal >= 6) {
        println("Aluno aprovado")
    } else {
        var n4:Double = 5.5
        val novaMedia = (mediaFinal + n4) / 2
        if (novaMedia >= 6) {
            println("Aluno aprovado")
        } else {
            println("Aluno reprovado")
        }
    }
}

/*
4. Inicialize uma variável contendo o salário atual e outra variável contendo a
opção que será acessada no menu. Para opção 1 deve ser acrescido 30% no
salário, para opção 2 deve ser acrescido 40% no salário, para opção 3 deve ser
acrescido 50% no salário e para a opção 4 deve ser acrescido 60% no salário.
Exiba o valor reajustado.
*/

fun main() {
    var salario = 2000.0
    var opcao = "opcao 4"
    operacao(salario, opcao)
}

fun operacao(salario: Double, operacaoEscolhida: String) {
    if (operacaoEscolhida == "opcao 1") {
        var salarioAjustado: Double = salario + (salario * 0.3)
        println(salarioAjustado)
    } else if (operacaoEscolhida == "opcao 2") {
        var salarioAjustado: Double = salario + (salario * 0.4)
        println(salarioAjustado)
    } else if (operacaoEscolhida == "opcao 3") {
        var salarioAjustado: Double = salario + (salario * 0.5)
        println(salarioAjustado)
    } else {
        var salarioAjustado: Double = salario + (salario * 0.6)
        println(salarioAjustado)
    }
}

/*
5. Calcule e mostre o quadrado dos números entre 40 e 200 dos números
inteiros pares.
*/

fun main() {
    for (numero in 40..200 step 2) {
        var quadrados = numero * numero
        println("O quadrado do $numero é $quadrados")
    }
}

/*
6. Calcule e mostre a soma dos números pares e quantidade de números
ímpares entre 1 e 800.
*/

fun main() {
    var somaPares: Int = 0
    var impares: Int = 0
    for (numero in 1..800) {
        if (numero % 2 == 0) {
            somaPares += numero
        } else {
            impares += 1
        }
    }
    
    println("Numeros pares: $somaPares")
    println("Numeros impares: $impares")
}

/*
7. Inicialize um número que conterá o final da iteração. Apresente em console
todos os valores de 1 ao número inicializado que são divisíveis por 5.
*/

fun main() {
    var numFinal: Int = 20
    for (numero in 1..numFinal) {
        if (numero % 5 == 0) {
            println(numero)
        }
    }
}