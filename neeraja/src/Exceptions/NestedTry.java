package Exceptions;

//program to check nested try-catch blocks
public class NestedTry {
public static void main(String[] o){
    int a=10, b=20;
       
        try{
            //nested try block
            int c=a/b;
            try {
                b=0;
               c=a/b;
               System.out.println(c);
            }
            catch(ArrayIndexOutOfBoundsException q){
               System.out.println(q);
            }
        }
        //Exception handler
         catch(ArithmeticException s){
             System.out.println(s);
        }
        //finally block
        finally{
           System.out.println("this is finally block");
        }
        System.out.println("a value "+a);
        System.out.println("b value "+b);

    }

}

