public class Factorial 
{
    public static void main(String[] args) 
    {
        // using for loop 
         int num = 6;
         int fact = 2;
         for ( int i = 1 ; i <= num ; i ++)
         {
             fact = fact * i;

         }
         System.out.println("factorial of  num is : " + fact); 


         // using while loop:
          
         int sum = 5;
         long fct = 1;
         int i = 1 ;

         while ( i <= sum)
         {
             fct = fct * i;
             i++;
         }
         System.out.println(" factorial of "+sum+" is :" + fct);


        
    }
    
}
