class Counterex
{
    int i;
    public void increment() // creating method as increment
    {
        System.out.println();
    }
}
class Counter7 extends Counterex //childclass extends the counterex
{
    public static void main(String[] args) 
    {
     Counterex c = new Counterex(); 
     c.increment(); //calling method with the object 
     c.i =3; //assigning value to the i
     System.out.println("i =" +c.i);

    }
}
