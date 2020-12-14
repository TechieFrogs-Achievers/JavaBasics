package ExceptionsExercises;



public class ExceptionPrgrm8 
{
        //... Exception with overloading Methods..//
    
        int method(int n) throws ArithmeticException 
        {
            return n/0;
        }
        // taking boolean method 
        public static boolean method(boolean b)  
        {
            return b;
        }
         // method  inside parameter values are declare in double 
        public static double method(int x, int y)
        {
            return x + y;    // Addition operation perform
        }

        public static void main(String[] args) 
        {
            ExceptionPrgrm8 e = new ExceptionPrgrm8();   // creating object for main class
            // try block
            try 
            {
                System.out.println(method(5, 9));
                System.out.println(method(true));
                System.out.println(e.method(5));
            }
            // catch block
            catch(ArithmeticException a)
            {
                System.out.println("ArthimeticException occurs"+a);
            }
            
        }
    
}
