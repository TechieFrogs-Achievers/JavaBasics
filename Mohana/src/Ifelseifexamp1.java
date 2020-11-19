public class Ifelseifexamp1 
{
    public static void main(String[] args) {
        
        int score = 49;
         
        if( score  == 35 )
        { 
         System.out.println( " you passed the exam  " );
        }
        else if ( score > 35 & score <= 50 )
        {
            System.out.println( " you got 3rd class" );
        } 
        else if ( score > 50 & score <= 75 )
        {
            System.out.println( " you got 2nd class" ); 
        }
        else if ( score > 75 & score <= 100 )
        {
            System.out.println( " you got 1st class " );
        } 
        else 
        {
            System.out.println( " fail !! "); 
        }
    }
    
}
