package ExceptionDoc;
class  Student
{
  public void attendence(int atd) //method having one parameter
  {
      //condition to check attendence
    if(atd < 75)
    {  

        //using throw to throw our own exception
        throw new ArithmeticException("provide attendence greater than 75");

       
    } 
           
    //if that condndition false it prints else statement
    else
    {
        System.out.println("you are qualified");
    }
  }
}
public class Program3 
{
    public static void main(String[] args) 
    {
       Student st = new Student(); //student class obj creation
       st.attendence(65);//metod call
        
    }
    
}
