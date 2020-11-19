public class Lcm  
{
    public static void main(String[] args) 
    {
        int number1 = 20 , number2 = 28 , gcd = 1 , lcm ;
        
        // Lcm of two numbers from GCD
        
        for( int i = 1 ; i <= number1 && i <= number2 ; i++)  
        {
            if( number1 % i == 0 &&  number2 % i == 0 )
           {
              gcd = i ; 
           }  
        }  
        
        lcm = ( number1 * number2)/ gcd ;
        System.out.println( " The lcm of two numbers is = " + lcm );
        
    }
    
}
