package ExceptionDoc;

class Employee
{ 
   
    //method to get employee details it throws an exception
    public void details(String name) throws NullPointerException
    { 
        //condition to check name
        if(name == null)
        throw new NullPointerException("Provide correct details"); //if true it throws an exception
       
        else
        {
            System.out.println(name);
        }
    }
}

public class Program4 
{
      public static void main(String[] args) 
      {  
          //try and catch to handle that exceptions
          try
          {
          Employee emp = new Employee(); //creating emp obj
          emp.details(null); //method call
          }
          catch(NullPointerException ne) //to handle exception
          {
              System.out.println("provide String value ");
          }

          System.out.println("after try catch");
          
      }
 }
