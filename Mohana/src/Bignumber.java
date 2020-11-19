public class Bignumber  
{
    public static void main(String[] args) 
    {
       int a = 10 , b = 40 , c = 30 ;

       //largest among three 

       if( a > b && a > c) 
       {
           System.out.println(  " a is big  : " +a );
       }
       else if( b > a && b > c)
       {
           System.out.println( "b  is big : " + b);
       }
        else 
        {
            System.out.println(  " c is big : " + c );
        }
    }
    
}
