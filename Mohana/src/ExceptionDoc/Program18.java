package ExceptionDoc;

public class Program18 
{  

    void studentMarks(int marks)//method to check marks
    { 
        //try and catch blocks to check multiple exceptions 
         try
         {
             if(marks >100 ) //if condition true 
             //it throws an exception
               throw new IllegalArgumentException("marks must be positive and less than 100");
             
                 System.out.println(marks);
             

         } 
         //to catch an exception
         catch(IllegalArgumentException ie) //it catches illegal argument exception
         {
             System.out.println("please provide correct marks");
         }
    }

    public static void main(String[] args) 
    {
        //obj creation
         Program18 pr = new Program18();
         pr.studentMarks(150);
    }
}
