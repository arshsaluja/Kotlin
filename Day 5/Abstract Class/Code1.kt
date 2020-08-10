
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
    var t= Teacher("Arsh")
    t.displaycode(3987)
    t.jobdetails("teach")
}
