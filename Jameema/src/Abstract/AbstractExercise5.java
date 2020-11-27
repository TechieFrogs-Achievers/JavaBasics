package Abstract;
abstract class Animals //abstract class
{
    abstract void cats(); //abstract methods
    abstract void dogs();
}
class Cats extends Animals //inherits abstract class details
{
    void cats() //method
    {
        System.out.println("Cats meow");
    }
    void dogs() //deafult method
    {

    }

}
class Dogs extends Animals
{
    void cats() // default  method
    { 

    }
    void dogs() 
    {
        System.out.println("Dogs Bark"); //print 
    }

}
public class AbstractExercise5 
{
    public static void main(String[] args)
     {
         //Animals a= new Animals();
         Animals c = new Cats(); //creating object
         Animals d = new Dogs(); //upcasting
         c.cats(); //calling method
         d.dogs();
        
    }
    
}
