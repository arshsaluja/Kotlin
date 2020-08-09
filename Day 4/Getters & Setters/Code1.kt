//geters-for getting values for a property
//setters- for setting values for a property
class Person()
{
    var name:String ="Default value"
    
        //get() - to get the name in the field
        //set() - value is arsh  and field is name
        
    get()=field
    set(value)
    {
        field=value
    }
}
fun main(args:Array<String>)
{
 var p1=Person()
    p1.name="Arsh"
    println("Your name is ${p1.name}")

}
