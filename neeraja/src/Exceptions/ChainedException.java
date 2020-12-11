package Exceptions;

//program to check chained exceptions
public class ChainedException {
    //instance method throwing an exception
    void divide(){ 
        //Exception handker 
    try{
        int a=9,b=0;
        int c=a/b;
        System.out.println(c);
        }
        //user defined exception handler
        catch(ArithmeticException a)
        {
          System.out.println(a);
          //creating new exception
          NullPointerException e=new NullPointerException();
          //set the exception to present underlying exception
          e.initCause(new InterruptedException("cause"));
          throw e;//throwing an exception
        }
    }
 public static void main(String[] r){
   // ChainedException n=new ChainedException();
   // n.divide();

   //user defined exception
    try{
    ChainedException n1=new ChainedException();
    n1.divide();

    }
    catch(NullPointerException w)  {
        System.out.println("CAUSE "+w.getCause());
    } 
    
}
}