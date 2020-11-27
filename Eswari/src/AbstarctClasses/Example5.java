package AbstarctClasses;

//abstract class creation
abstract class Animals
{
    //abstract methods declaration
    abstract void cats();
    abstract void dogs();

}
//sub class
class Cats extends Animals
{
    //abstract method implementation
    void cats()
    {
        System.out.println("Cats meow");
    }
    void dogs()
    {

    }
}

//second sub class
class Dogs extends Animals
{
    //abstract method implementation
    void dogs() {
        
        System.out.println("Dogs bark");
    }
    void cats() 
    {
            
    }
}


public class Example5 
{
    public static void main(String[] args) {
        Cats c = new Cats();                //cats class object creation
        c.cats();                            //method calling
        Dogs d = new Dogs();
        d.dogs();
    }
    
}
