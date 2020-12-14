package Exceptions;

public class Exceptions18 
{
    void studentMarks(int marks)
    {
         try
         {
             if(marks >100 )
               throw new IllegalArgumentException("marks must be positive and less than 100");
             
                 System.out.println(marks);
             

         } 

         catch(IllegalArgumentException ie)
         {
             System.out.println(ie+"has occured");
         }
    }

    public static void main(String[] args) 
    {
        
         Exceptions18 pr = new Exceptions18();
         pr.studentMarks(340);
    }
}
