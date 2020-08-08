//it is for pattern checking
fun main(args: Array <String>)
{
    var r=Regex("[tT]rue|[yY]es")
    println("Do You Want a happy life? ")
    var str= readLine()!!
    var result =r.matches(str)
    print("My ans is- $result")
}
//use it for data cleaning
