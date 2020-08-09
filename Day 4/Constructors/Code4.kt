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
    println("Enter the first name and age")
    var ab=readLine()!!
    var bc=Integer.valueOf(readLine()!!)
    var p1=Person(ab,bc)
    println("Now Printing the default values")
    var p2=Person()
}
