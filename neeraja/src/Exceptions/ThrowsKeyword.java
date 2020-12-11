package Exceptions;
//handling exception using throws keyword
public class ThrowsKeyword {
     //mmethod throwing exception
    void divide()  throws ArithmeticException{
        double c=10/0;
        System.out.println(c);
    
    }
public static void main(String[] k) {
        //instantiation of a class
        ThrowsKeyword t = new ThrowsKeyword();
        
        try{
        t.divide();
        }
        //exception handler
        catch(ArithmeticException q){
           // q.printStackTrace();
           System.out.println(q.getMessage());
           System.out.println(q);
        }

     }

    
}
