package AbstractionExamples;
abstract class Animals
{
    abstract void cats(); //abstract method
    abstract void dogs(); //abstract method
} 

 abstract class Cats extends Animals //here cats class also abstract because we are not 
 //implementing all abstract methods of  Animal class
{
    void cats()//abstract method implementation
    {
        System.out.println("Cats meow");
    }   
    abstract void dogs(); //abstract method
}

class Dogs extends Cats
{  
    void dogs()//abstract method implementation
    { 
        System.out.println("Dogs Bark");

    }

}
public class Program5 
{
    public static void main(String[] args) 
    { 
        //obj creation
        Cats c = new Dogs();
        c.cats();
        c.dogs();

        
    }
    
}
