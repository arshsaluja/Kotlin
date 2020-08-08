class Lamp
{
    var isOn:Boolean=false
    fun turnOn()
    {
        isOn=true
    }
    fun turnOff()
    {
        isOn=false
    }
    //nested func
    fun lampStatus(l:String)
    {
        if(isOn==true)
            println("$l  is on")
        else
            println("$l  is off")
    }
}
fun main(args: Array <String>)
{
    var l1=Lamp()
    var l2=Lamp()
    l1.turnOff()
    l2.turnOn()
    println("Enter the names of the lamps")
    var i= readLine()!!
    var j= readLine()!!
    l1.lampStatus("$i")
    l2.lampStatus("$j")

}
