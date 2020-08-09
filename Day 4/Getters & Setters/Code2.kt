class Person()
{
    var firstname:String ="Default Value"
    var surname:String ="Default Value"
    get()=field
    set(value)
    {
        field=value
    }
}
fun main(args:Array<String>)
{
 var p1=Person()
    p1.firstname="arsh"
    p1.surname="saluja"
    println("Your full name is ${p1.firstname} ${p1.surname}")
}
