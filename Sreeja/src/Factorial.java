public class Factorial
 {
     public static void main(String[] args)
      {
        
        /*
        int n = 1;
         int fact = 1;

         while(n<=5)
        {
            fact=fact*n;
            n++;
        }
        System.out.println(fact);

            */


        int fact = 1;
        for(int i=1;i<=5;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
     }

    
}
