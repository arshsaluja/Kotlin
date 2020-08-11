
//data classes are used to store data/hold data i.e its not for processing
//there should be atleast one parameter in data class
//cannot create a open or abstract class

data class Person(var name:String,var age:Int)
fun main(args:Array<String>)
{
    var obj=Person("Arsh",20)
    println("The name of the data class is ${obj.name}")
    println("The age of the data class is ${obj.age}")
    
}
