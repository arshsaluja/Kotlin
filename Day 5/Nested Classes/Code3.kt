
class outer()

{
    class inner()
    {
        class innermost() {
            var b = "This is the innermost class variable"
            fun greet() {
                println("Hello u r inside a function inside innermost class")
            }
        }
    }
}
fun main(args:Array<String>)
{
    //brakets always on the last class
    var a=outer.inner.innermost().b
    println(a)
}
