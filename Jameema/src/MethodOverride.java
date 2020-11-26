class BaseClass
{
    public void MyMethod() //method
    {
        System.out.println("this is baseclass");
    }
}
public class MethodOverride extends BaseClass //inherits parent class details
 {
     public void MyMethod() //override method
     {
         super.MyMethod(); //calling parent class method
         System.out.println("this is child class");
     }
     public static void main(String[] args)
      {
          MethodOverride m =  new MethodOverride(); //creating object
          m.MyMethod(); //calling method by using child class object
         
     }


    
}
