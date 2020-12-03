package Abstract;
import Interface.Example3;

abstract class Animals 
{
    abstract void cats();    //creating methods
    abstract void dogs();
}
class Cats extends Animals  //subclass inherits the properties of parent class
{
     void cats()    //creating method for the subclass
    {
        System.out.println("cats say meow:");
    }
     void dogs()
     {

     }
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("Dogs Bark:");  //prints the subclass method
    }
    void cats()    //null method 
    {

    }
    public static void main(String[] args) 
    {
        Animals a = new Cats();   //upcasting
        a.cats();
        //System.out.println("Cats:"+a.Cats());
        Animals a1 = new Dogs();
        a1.dogs();
        //System.out.println("Dogs:"+a1.Dogs());
        Example3 e = new Example3(); //creating the object for the import package(interface)
        e.sample();
        e.input();   //calling the object 
        e.display();

    }

}

