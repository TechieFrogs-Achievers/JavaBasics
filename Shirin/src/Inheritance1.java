class Parentclass  
{
    // create method for parent class
    void Parentmethod()
    {
        // print parent class
        System.out.println("This is parent class");
    }
    
}
     // child class
 class Childclass extends Parentclass
{
    // create method for child class
     protected void Childmethod()
    {
        System.out.println(" This is child class ");

    }
}
// calling  main class 
public class Inheritance1
{
    public static void main(String[] args) 
    {
        Parentclass p = new Parentclass();// creating obiject for parent class
        p. Parentmethod() ;// calling parent method 
        Childclass c = new Childclass(); // creating object for child class
        c. Childmethod();// calling child method 
        c . Parentmethod();// calling child method with child object

        
    }

}
