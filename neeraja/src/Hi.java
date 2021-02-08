public class Hi {
    public static void main(String[] args){

 
       // System.out.println( "Hello" + args[0] ); 
       
      /* String [][] argument = new String[2][2];
       int x;
       argument[0] = args;
       x = argument[0].length;
       for (int y = 0; y < x; y++) 
           System.out.print(" " + argument[0][y]);  */

           try 
           	 {
        	     int a = args.length;
           	     int b = 10 / a;
           	     System.out.print(a);
           	    try 
           	     {
           	     if (a == 1)
           	      a = a / a - a;
           	    if (a == 2) 
           	    {
           	    int []c = {1};
           	     c[8] = 9;
           	     }
           	     }
           	    catch (ArrayIndexOutOfBoundException e) 
           	     {
           	    System.out.println("TypeA");
           	     }
           	     catch (ArithmeticException e) 
        	     {
           	    System.out.println("TypeB");
           	     }
         }
    }

}

