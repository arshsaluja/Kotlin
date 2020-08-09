//if we want to make a class parent write-open
open class Person() {
    open fun display(age:Int,name:String)
    {
        println("My name is $name and my age is $age")
    }
}
//to override a function use override
class girl():Person()
{
    override fun display(age:Int,name:String)
    {
        println("Overriden fuc:")
        println("My name is $name and my age is ${age-5}")
    }
}
fun main(args:Array<String>)
{
    var o=girl()
    o.display(20,"arsh")
}
