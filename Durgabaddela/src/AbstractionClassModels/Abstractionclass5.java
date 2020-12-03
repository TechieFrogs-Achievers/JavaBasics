package AbstractionClassModels;
abstract class Animal//abstract class
{
    abstract void cats();//abstract method
    abstract void dogs();//method method
}
class Cats extends Animal
{
    void cats()//override method implementation
    {
        System.out.println("CatsMeow");
    }
    void dogs()//override method  implementation 
    {
		
	}
} 
class Dogs extends Animal
{
    void cats()//override method  implementation
    {

    }
    void dogs()//override method impelmentation
    {
        System.out.println("DogsBark");
    }
} 
public class Abstractionclass5 
{
    public static void main(String[] args)
    {
      Animal c = new Cats();//object dor subclass cow
      c.cats();//calling method in cow class
      Animal d = new Dogs();//object for sunclass dogs
      d.dogs();//calling method in dogs class
    }
}
