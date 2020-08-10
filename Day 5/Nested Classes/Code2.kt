
class outer()

{
    class inner()
    {
        var b="This is the inner class variable"
        fun greet()
        {
            println("Hello u r inside a function inside inner class")
        }
    }
}
fun main(args:Array<String>)
{
    var p=outer.inner().greet()
    print(p)
}
