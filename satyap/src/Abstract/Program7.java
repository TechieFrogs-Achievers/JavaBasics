package Abstract; // Package for own class
import Interface.InterfaceClass7; //Package for different package
public class Program7
{
    protected class Sample3 implements InterfaceClass7
    {
        public Sample3()
        {

        }
      public void display()
      {
         System.out.println("Package created");
      } 
    }
}