package AccessModifiersExamples;

class Department
{
   protected String name  = "ECE";
   protected void display()//method without any parameters
    {
        System.out.println( " protected method ");
    }
       
   
}
public class ProtectedEx 
{

     public static void main(String[] args) 
     {
         Department de = new Department();

          de.display(); //calling protected method with in another class
          System.out.println( " protected variable " +de.name );//calling protected variable 
        
         
     }
}
