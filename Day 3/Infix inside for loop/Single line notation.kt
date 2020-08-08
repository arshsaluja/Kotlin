//Infix Inside For Loop 
// Single line notation
fun main(args: Array<String>)
{
   // earliar-----   for(i in 1..10) ---- behaves like <=
    //now---------
    for(i in 1 until 10)//behaves like < not <= 
    {
       println("Value of i is $i")
   }
    //Output - 1 to 9
}
