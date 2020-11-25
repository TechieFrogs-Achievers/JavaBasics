package inheritence;

//parent class
class Counter
{
    int i;

    //method to print i value
    public void increment()
    {
        System.out.println("i="+i);
    }
}

public class Program7 extends Counter
{
    public static void main(String[] a)
    {
        //object for counter class
       Counter c=new Counter();
       c.i=3;         // assigning value to variable i
       c.increment(); //calling parent class method
    }
    
}
