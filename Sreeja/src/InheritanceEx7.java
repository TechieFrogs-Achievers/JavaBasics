class Counter
{
    int i;          //defining data member

    void increment(int a)       //method to insert value
    {
        i = a;
    }
}

public class InheritanceEx7 extends Counter
{
    public static void main(String[] args) 
    {
        Counter c = new Counter();      //object creation 
        c.increment(3);         // method calling
        System.out.println("i = "+c.i);     //printing the value
   }
   
    
}
