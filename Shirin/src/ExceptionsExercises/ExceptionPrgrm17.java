package ExceptionsExercises;

// super class
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
// main class
class ExceptionPrgrm17       
{
    public static void main(String args[])throws InstantiationException,IllegalAccessException,ClassNotFoundException
    {
        Class c = A.class;          
        c.newInstance();
    }
    
    
}
