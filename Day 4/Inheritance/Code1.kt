//if we want to make a class parent write-open
open class Person(age:Int,name:String)
{
    init {
        println("My name is $name")
        println("My age is $age")
    }
}
class Teacher(age:Int,name:String):Person(age,name)
{
    fun math()
    {
        println("I teach maths")
    }
}
class Football(age:Int,name:String):Person(age,name)
{
    fun play()
    {
        println("I play Football ")
    }
}
fun main(args:Array<String>)
{
    var o=Teacher(40,"ashima")
    o.math()
    var p=Football(30,"Ronaldo")
    p.play()
}
