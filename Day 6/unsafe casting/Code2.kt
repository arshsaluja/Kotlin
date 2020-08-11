//unsafe casting
//this casting iss never used as it always gives wrong output
fun main(args:Array <String>)
{
    var a: Any=123
    var b:String?=a as? String
    if(b is String)
        println("$b is a String")
    else
        println("$b is not a String")
}
