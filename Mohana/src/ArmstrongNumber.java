public class ArmstrongNumber 
{
    public static void main(String[] args)  
    {

        int number = 153 , reminder , tempvariable , armstrong  = 0 ; 

        tempvariable = number ;
         
        while( number != 0 )
        {
            reminder = number % 10 ;
            armstrong += reminder * reminder * reminder ; 
            number = number / 10 ;

        } 
        if( armstrong == tempvariable)
        {
            System.out.println( " Armstrong number ");
        } 
        else 
        {
            System.out.println( " Not an aramstrong number ");
        }
        
    }
    
}
