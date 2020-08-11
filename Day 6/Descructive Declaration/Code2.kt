
//Descructive Declaration
//split and multi variable use!!
//an object can hold multiple categories

data class Person(var name:String,var age:Int,var roll:Int)
fun main(args:Array<String>)
{
    var (a,b,c)=Person("Arsh",20,17)
    println("The name of the data class is ${a}")
    println("The age of the data class is ${b}")
    println("The roll no of the data class is ${c}")
}
