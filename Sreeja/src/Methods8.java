class A1
{
    static void show()          //method to print
    {
        System.out.println("Parent");
    }
}
class B1 extends A1
{
    static void show()          //method to print (same method as in parent class)
    {
        System.out.println("Child");
    }
}

public class Methods8
 {
 public static void main(String[] args)
  {
    
    //// method calling by using class names
    
    A1.show();  
    B1.show();
    
    
   }
   
    
}
