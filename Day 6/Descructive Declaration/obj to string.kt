
//Object to String
//when the class is in other location and we wnat to see the whole object
data class Person(var name:String,var age:Int,var roll:Int)
fun main(args:Array<String>)
{
    var obj=Person("Arsh",20,17)
    println(obj.toString())
}
