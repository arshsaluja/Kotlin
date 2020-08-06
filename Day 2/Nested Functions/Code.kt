//A function inside other function
fun sum(vararg num:Double)
{
    var s=0.0
    for(n in num)
    {
        s=s+n
    }
    println("Sum of the numbers is ${s}")
    fun half(h:Double)
    {
        println("Half is ${h/2}")
    }
    half(s)//function calling -due to the scope of s variable we can use nested functions
}
fun main(args:Array<String>)
{
    sum(1.1,2.2,3.3,4.4,5.5)
}
