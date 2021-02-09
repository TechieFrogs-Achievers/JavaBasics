package Exceptions;

public class exception3
 {
    static void Student(int age, int  weight)//method with student parameters
    { 
        if(age<18 && weight<40) 
        {
            //if age and weight are not matched then throw an arithematic exception
           throw new ArithmeticException("Student is not eligible for  voter registration"); 
        }
        else 
        {
           System.out.println("Student is eligible"); 
        }
     } 
  
     public static void main(String args[]){ 
       System.out.println("Voter Registration process");
       Student(10, 39); //passing to method
   } 
}
