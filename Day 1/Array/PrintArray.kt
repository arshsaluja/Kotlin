import java.util.Arrays
fun main(args: Array<String>)
{
  //Integer array
  var numbers=arrayOf(1,2,3,4)
  println(Arrays.toString(numbers))
  //String array
  var names=arrayOf("John","Sam","Mohan","Raja")
  println(Arrays.toString(names))
  //Mixed array
  var mixed=arrayOf(1,"John",2,"Sam",3,"Mohan",4,"Raja")
  println(Arrays.toString(mixed))
}
