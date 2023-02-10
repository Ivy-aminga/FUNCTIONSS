fun main(){
greetName("Ada")
var y = (56 % 17)
    println(y)
    var k = (190 + 280 + 34 + 67)
    println(k)
    fact("seeing people argue gives me some type of satisfaction")
}
fun greetName(name: String){
    println("Hello $name")
}

fun modulus(num1: Int, num2: Int): Int{
    var modulus = num1 % num2
    return modulus

}

fun addition(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}

fun fact(myself: String){
    println(myself)
}