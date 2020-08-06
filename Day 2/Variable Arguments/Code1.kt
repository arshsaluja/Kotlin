//varagr - it behaves as a pseudo array
//bt here we can pass any no of arguments unlike array as fixed length
fun sum(vararg num:Double)
{
    var s=0.0
    for(n in num)
    {
        s=s+n
    }
    print("$s")
}
fun main(args: Array<String>)
{
    sum(1.1,2.2,3.3,4.4,5.5)
}
