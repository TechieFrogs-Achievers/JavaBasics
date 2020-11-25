package InheritanceDoc;

class Counter
{
    public int i ;
    public void increment()
    {
        System.out.println("i=" +i);
    }
} 
public class Program7 extends Counter 
{  
    public static void main(String[] args)
     {

      Counter c = new Counter(); 
      c.i = 3;
      c.increment();
     } 
}
