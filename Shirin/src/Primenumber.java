public class Primenumber 
{ 
    public static void main(String[] args) 
   {
    
    int number = 21;
    boolean p  = false ;
    for ( int i = 2 ; i<= number/ 2 ; i++)
    {
        if ( number % i ==0)
        {
            p = true;
            break;
        }

    }
    if (!p)
    {
        System.out.println("number is a prime number " + number);
    }
    else 
    {
        System.out.println(" number is not a prime number " + number);
    }
  } 
    
}
