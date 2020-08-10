abstract class Person(name:String)
{
    init{
        println("My name is $name")
    }
    abstract  fun jobdetails(job:String)
    fun displaycode(code:Int)
    {
        println("The code is: $code")
    }

}
class Teacher(name: String):Person(name)
{
    override fun jobdetails(job: String) {
        println("and my job is to $job")
    }
}
fun main(args:Array<String>)
{
    //since we cannot create objects of the abstract class
    println("Enter the name code and job of the person!!")
    var n= readLine()!!
    var c=Integer.valueOf(readLine()!!)
    var j= readLine()!!
    var t= Teacher(n)
    t.displaycode(c)
    t.jobdetails(j)
}
