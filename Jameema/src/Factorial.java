public class Factorial
 {
     public static void main(String[] args)
      {
        long fct = 1;
        int n=8;
        for(int i = 1; i <= n; i++)
        {
            fct = fct * i;
        }
        System.out.println("Factorial of "+n+" is: "+fct);
         
     }
    
}
