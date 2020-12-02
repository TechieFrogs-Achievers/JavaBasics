package InterfaceExercise;
// interface class
interface FastFood
{
    public void  Burger();//methods
    public void  Pizaa();
    public String Shawarma();
    
}
//child class 
public class Sandwitch implements FastFood
{
    public void  Burger()
    {
        System.out.println("this is Burger");
    }
    public void Pizaa()
    {
        System.out.println("this is Pizza");
    }
    public String Shawarma()
    {
        return "This is shawarma";//return 
    }
    public static void main(String[] args)
     {
         Sandwitch s = new Sandwitch();//creating objects
         // calling methods with object
         s.Burger();
         s.Pizaa();
         s.Shawarma();
        
    }
}
