class Person()
{
    var firstname:String ="Default Value"
    var surname:String ="Default Value"
        var age:Int=0
        get()=field
        set(value)
        {
            field=value
        }
}
fun main(args:Array<String>)
{
    var p1=Person()
    println("Enter the firstname , surname and age")
    p1.firstname=readLine()!!
    p1.surname=readLine()!!
    p1.age=Integer.valueOf(readLine()!!)
    println("My full name is ${p1.firstname} ${p1.surname} and my age is ${p1.age}")
}
