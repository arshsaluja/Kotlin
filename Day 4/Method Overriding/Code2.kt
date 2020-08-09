
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
    fun play()
    {
        println("girls plays football")
    }
    override fun display(age:Int,name:String)
    {
        println("Overriden fuc:")
        println("My name is $name and my  fake age is ${age-5}")
    }
}
class boy():Person()
{
    fun play()
    {
        println("boys plays football")
    }
}
fun main(args:Array<String>)
{
    var o=girl()
    o.display(20,"ashima")
    o.play()
    var ob=boy()
    ob.display(20,"vardaan")
    ob.play()
}
