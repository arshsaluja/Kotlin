fun main(args: Array<String>)
{
    var n= intArrayOf(1,2,3,4,5)
    for(num in n.indices)
    {
        println("Value at location ${num+1} is ${n[num]}")
    }
}
