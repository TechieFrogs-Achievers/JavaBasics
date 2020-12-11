package Exceptions;

public class ExceptionHandling3 
{
    static void validate(int age)//method
    {  
        if(age<18)  //condition for age
         throw new ArithmeticException("not valid");  
        else  
         System.out.println("welcome to vote");  
     }  
      public static void main(String args[])
      {  
         validate(13); //method calling 
         System.out.println("rest of the code...");  
     }  
    
}
