package AbstractExercises;//Abstract package
import InterfaceExercise.NewPack;// importing interface package (newpack file) 
public class Newinterface// outer class
{
    protected class Nestedclass implements NewPack // inner class implementing properties  
    {    
         // default constructor
         public Nestedclass()
        {

        }
        public void demo()// inner class method
        {
            System.out.println("Nestedclass in 2nd package");
        }
        
         public void pack()// defining  interface  method
        {
           System.out.println(" interface method");
        }
    }
    
}
