package AbstractionExamples;
abstract class Bird //abstract class
{ 
    final int num = 20; //final variable  
    protected String name;//private variable 
   public Bird() //constructor 
   {
       System.out.println(" abstract calss constructor");
   } 

   abstract void wings(); //abstract method

   void type()//normal method
   {
         System.out.println("Iam a bird");
   }
}   

class Parrot extends Bird
{
    void wings() //implementation of abstract method
    {
        System.out.println("parrot has 2 wings");
    } 

    void colour() //normal method
    {
        System.out.println("Iam green in colour");
    }
}
public class Example2 
{
    public static void main(String[] args) 
    {  
        //obj creation

        Parrot b = new Parrot();
        b.wings();
        b.type();   
        b.colour();  
        b.name = "Protected variable";  
        System.out.println(b.num); 
        System.out.println(b.name);  
    }
    
}
