package AbstractExercises;
//Abstract class
abstract class Animals
{   
    // abstarct methods
    abstract void cats();
    abstract void dogs();

}
// sub class
class Cats extends Animals // inheriting properties from abstrat class
{ 
    void cats()// method for cat class
    {
        System.out.println("Cats meow");
    }
    void dogs()// empty method
    {

    }
}
// another sub class
class Dogs extends Animals // inheriting properties from abstrat class

{   
    void cats()// empty method
    {

    }
    void dogs()// method for dog class
    {
        System.out.println("Dogs bark");
    }

}
// main class
public class  AbstractProgram5
{
    public static void main(String[] args) 
    {   
        // upcasting
        Animals a = new Cats();
        Animals b = new Dogs();
        a.cats();//calling method
        b.dogs();
        
    }
}

