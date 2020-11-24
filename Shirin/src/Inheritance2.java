class Parentclass1  
{
    // create method for parent class
     private void Parentmethod()
    {
        // print parent class
        System.out.println("This is parent class");
    }
    
}
     // child class
 class Childclass1 extends Parentclass
{
    // create method for child class
      void Childmethod()
    {
        System.out.println(" This is child class ");

    }
}
// calling  main class 
public class Inheritance2
{
    public static void main(String[] args) 
    {
       //Parentclass1 p = new Parentclass1();// creating obiject for parent class
       // p. Parentmethod() ;// calling parent method 
        Childclass1 c = new Childclass1(); // creating object for child class
        c. Childmethod();// calling child method 
       // c . Parentmethod();// calling child method with child object

        
    }

}


