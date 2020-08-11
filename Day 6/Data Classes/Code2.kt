
//data classes are used to store data/hold data i.e its not for processing
//COPY ONE OBJ TO ANOTHER OBJECT:
data class Person(var name:String,var age:Int)
fun main(args:Array<String>)
{
    var obj=Person("Arsh",20)
    var aj=obj.copy("Arshhhhhh")
    println("The name of the data class is ${obj.name}")
    println("The age of the data class is ${obj.age}")
    //it will overwrite the main variable:-
    println("The age of the data class is ${aj.name}")
    println("The age of the data class is ${aj.age}")
}
