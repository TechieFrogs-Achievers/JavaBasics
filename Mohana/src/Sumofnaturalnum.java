public class Sumofnaturalnum 
{
    public static void main(String[] args) 
    {
        int number = 50 ,sum = 0;

        //sum of natural numbers 

        for( int i = 1 ; i <= number ; i++) 
        {
            sum = sum + i ;
        }  

        System.out.println( " The sum of first " +number + "  numbers  is " + sum );
        
    }
    
}
