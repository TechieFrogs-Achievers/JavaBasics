public class Palindrome 
{
    public static void main(String[] args) 
    {
        int number = 151 , reverse = 0 , tempvariable  , reminder  ;  

         tempvariable = number ;

        while( number != 0)
        {
            reminder = number % 10; 
            reverse = reverse * 10 + reminder ;
             number = number/10 ;
        } 

        if( reverse == tempvariable)
        {
            System.out.println( " The given number is  palindrome ");
        }
        else
        {
           System.out.println( " Not a palindrome ");
        }



        
    }
    
}
