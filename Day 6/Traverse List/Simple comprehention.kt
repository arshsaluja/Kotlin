
//Traverse List
//Simple comprehention
fun main(args: Array<String>)
{
     var mix: List<Any> =listOf("i","am","5","feet","4.01","inches","tall",true)
    for(value in mix)
    {
        if (value is String)
            println("$value is a String")
        else if (value is Int)
            println("$value is Integer")
        else if (value is Float)
            println("$value is Float")
        else
            println("$value is invalid")
    }

}
