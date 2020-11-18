public class forExercise
 {
    public static void main(String[] args) 
    {
        int sum = 0;
        int n = 5;

        for (int i=1;i<= n;i++)
         {
          sum =sum+i;
          System.out.println("Sum = " + sum);
         }


         //factorial
        long fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

        //faboncci series

        int  t1 = 0;
        int  t2 = 1;

        for (int i = 1; i <= n; ++i)
        {

            int tot = t1 + t2;
            t1 = t2;
            t2 = tot;
            System.out.println("faboncci series:" +t2);
        }

        
    }

    
}
