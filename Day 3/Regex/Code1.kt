//it is for pattern checking
fun main(args: Array <String>)
{
    var r=Regex("[tT]rue|[yY]es")
    var str="Yes"
    var result =r.matches(str)
    print("$result")
}
//use it for data cleaning 
