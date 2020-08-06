fun greet(message:String,name:String="Guest")
{
 println("${message} Dear,${name}")
}
fun main(args:Array<String>)
{
    greet("Welcometo Kotlin","Arsh")
}
//if we dont pass arsh it will take guest in output as it is the defaut argument
//OUTPUT
//Welcometo Kotlin Dear,Arsh
