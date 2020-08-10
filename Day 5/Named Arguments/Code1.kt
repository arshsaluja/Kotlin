//if we want to pass only 1 argument not 2

fun display(special:String="=",len :Int=5)
{
    for(i in 1..10)
    {
        print(special)
    }
}
fun main(args:Array<String>)
{
    display(len=10)
}
