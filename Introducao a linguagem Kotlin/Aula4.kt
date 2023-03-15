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
    
    -------------------------------------------------
    
    fun main(args: Array<String>) {
    var list = toList("ADS","BD","GTI")
    print(list)
    }
    
    fun toList(vararg args: String): List<String>{
    val list = ArrayList<String>()
    for (s in args)
    list.add(s)
    return list
    }
    
    -------------------------------------------------
    
    fun main(){
        var numx: Double
        var numy: Double
        var op: String
        numx = 20.0
        numy = 10.0
        op = "SUM"
        calc (numx, numy, op)
    }
    
    fun calc(numx: Double, numy: Double, op: String){
        var res: Double
    
        if (op == "SUM"){
            res = numx + numy
            print("$op, $numx + $numy = $res")
        } else if (op == "SUB") {
            res = numx - numy
            print("$op, $numx - $numy = $res")
        } else if (op == "MULT") {
            res = numx * numy
            print("$op, $numx * $numy = $res")
        } else if (op == "DIV") {
            res = numx / numy
            print("$op, $numx / $numy = $res")
        }
    
    }
    
    -------------------------------------------------
    
    fun main(){       
    somar(1,2)  
    subtrair(10,5)    
    multiplicar(6,2)    
    dividir(4,2)  
    }
    
    fun somar(num1:Int,  num2:Int): Int{
        return num1 + num2
    }
    fun subtrair(num1:Int,  num2:Int): Int{
        return num1 - num2
    }    
    fun multiplicar(num1:Int,  num2:Int): Int{
        return num1 * num2    
    }
    fun dividir(num1:Int,  num2:Int): Int{
        return num1 / num2
    }
    
    -------------------------------------------------
    
    fun calcula(num1:Double, num2:Double, operacao:String){   
    var resultado:Double = 0.0
    if(operacao == "SOMAR"){
      somar(valor1, valor2)
    resultado = num1+num2}
    else if (operacao == "SUBTRAIR"){
    resultado = num1-num2
    }else if (operacao=="MULTIPLICAR") {
    resultado = num1*num2
    }else if (operacao == "DIVIDIR"){
    resultado = num1/num2}
    print("$operacao, $resultado")
    }
    
    fun main(){       
    var num1=30.0
    var num2=20.0
    var operacao:String
    operacao = "SUBTRAIR"
    calcula(num1)
    }