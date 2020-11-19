public class GcdOfTwoNumbers 
{
    public static void main(String[] args) 
    {
       int number1 = 20 , number2 = 28 , gcd = 1;
        
       //GCD of two numbers 
       
       for( int i = 1 ; i <= number1 && i <= number2 ; i++)  
       {
           if( number1 % i == 0 &&  number2 % i == 0 )
          {
             gcd = i ; 
          }  
       }
    System.out.println( " GCD of two numbers is  = " + gcd ); 
    }  

}
