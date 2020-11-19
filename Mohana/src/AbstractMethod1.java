abstract class College
{ 
    //abstract method 
    abstract  void departments(); // method declaration
}
public class AbstractMethod1  extends College
{ 

void departments() // method implementation 
{
    System.out.println("  ***** ECE , CSE , IT ***** ");
} 
public static void main(String[] args)
{
       College dept = new AbstractMethod1();// obj creation
       dept . departments(); // method call
    
}

}
    

