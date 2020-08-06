fun greet(message:String,name:String="Guest")
{
 println("${message} Dear,${name}")
}
fun main(args:Array<String>)
{
    greet("Welcometo Kotlin")
}
//OUTPUT
//Welcometo Kotlin Dear,Guest
