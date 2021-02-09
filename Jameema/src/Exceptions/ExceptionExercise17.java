package Exceptions;
class A
   {
    int value1;
    int value2;
    A(int a,int b)  // constructor with arguments  
    {   
        // Assigning variables
        value1=a;          
        value2=b;
    }
}
  

public class ExceptionExercise17 
{
    public static void main(String args[])throws InstantiationException,IllegalAccessException,ClassNotFoundException
    {
        Class c = A.class;          
        c.newInstance();
    }
    
}
