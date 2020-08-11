//this casting iss never used as it always gives wrong output
//unsafe casting
fun main(args:Array <String>)
{
    var a: Any?=null
    var b:String?=a as String?
    if(b is String)
        println("$b is a String")
    else
        println("$b is not a String")
}
