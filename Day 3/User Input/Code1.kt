fun main(args:Array<String>)
{
    println("Enter your name:")
    
    //!!- represents not null expressions
    
    //readLine() -It always takes input as String
    
    var name= readLine()!!

    println("Your name is $name")
}
