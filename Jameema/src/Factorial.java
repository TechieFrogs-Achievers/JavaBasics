public class Factorial
 {
     public static void main(String[] args)
      {
        long fct = 1; //assigning value to variable
        int n=8;
        for(int i = 1; i <= n; i++)
        {
            fct = fct * i; //operation
        }
        System.out.println("Factorial of "+n+" is: "+fct); //print the factorial of the value
         
     }
    
}
