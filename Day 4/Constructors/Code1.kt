class Person(f:String,a:Int)
{
    var fn:String
    var age:Int
    init {
        fn=f.capitalize()
        //capitalize()- changes the first letter of the word capital
        age=a
        println("Your name is: $fn")
        println("Your name is: $age")
    }
}
fun main(args:Array<String>)
{
    var p1=Person("arsh",20)
}
