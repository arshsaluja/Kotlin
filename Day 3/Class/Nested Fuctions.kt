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
    l1.lampStatus("Lamp1")
    l2.lampStatus("Lamp2")

}
