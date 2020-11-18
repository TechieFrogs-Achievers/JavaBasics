public class Sumofnatural 
{
    public static void main(String[] args)
    {
        // using for  loop 
        int sum = 50 ; 
        int n = 1 , m = 0 ;
        int a = 1 ;
        for ( int i = 1; i <= sum; ++i)
        {
             n = n+ i;

        }
        System.out.println(" the sum of natural number is :" + n);



        // using while loop 

         while (  a<= sum )
         {
              m = m + a;
               a++; 
         }
         System.out.println( " sum of natiral number is " + m);
        
    }
    
}
