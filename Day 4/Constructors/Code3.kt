class Person(f:String="ashmeet", a: Int=18)
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
    var p2=Person()
}
