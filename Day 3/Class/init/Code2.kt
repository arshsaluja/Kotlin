//here init is same as constructor as in java
class Person(var name: String, var age:Int)
{
    init {
        println("My name is: $name")
        println("My age is: $age")
    }
}
fun main(args: Array <String>)
{
    println("Enter your name and age :")
    var n= readLine()!!
    var a= Integer.valueOf(readLine()!!)
    var obj=Person(n,a)
    //here obj is not used
}
