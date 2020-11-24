package AccessModifiersExamples;

 class Private1 
{ 
    private String name ;
    private void display() //private method 
    {
       System.out.println( "Private method ");
    }
} 
public class PrivateExample
{   
    private int salary = 2000;
    public static void main(String[] args) 
    {

       // Private1 pri = new Private1();
        PrivateExample p = new PrivateExample(); 

        System.out.println( p.salary); // calling private variable within in the same class is only possible

       // pri.name = " Mohana"; //we can not access private variable from another class
       
       // pri.display() 

        /* trying to call private method in another class we cant access this method*/
        
    }

}


