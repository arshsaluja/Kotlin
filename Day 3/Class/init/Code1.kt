//here init is as constructor as in java
class Person(var name: String, var age:Int)
{
    init {
        println("My name is: $name")
        println("My age is: $age")
    }
}
fun main(args: Array <String>)
{
    var obj=Person("Arsh",20)
    //here obj is not used
}
