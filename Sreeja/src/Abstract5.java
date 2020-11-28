//abstract class

abstract class Animals
{
    //abstract methods

    abstract void cats();

    abstract void dogs();

} 
//subclass of absract class

class Cats extends Animals
{
    void cats()         //implementation of abstract method cats
    {
        System.out.println("Cats meow");
    }
}

//subclass of abstract class

class Dogs extends Animals      
{
    void dogs()         //implementation of abstract method dogs
    {
        System.out.println("Dogs Bark");
    }
}


public class Abstract5
{
     public static void main(String[] args)
      {
          //creating objects for subclasses
        
          Dogs d = new Dogs();      
          Cats c = new Cats();

          //method calling with objects

          d.dogs();
          c.cats();
        
    }
}
