public class Armstrong 
{
    public static void main(String[] args) 
    {
        int a = 0 , x , y;
        int n = 321;
        y = n;
        while ( n > 0)
        {
            x = n % 10;
             n = n/10;
             a = a +(x*x*x);

        }
        if (y == a)
        {
            System.out.println(" given number is armstrong ");
        }
        else 
        {
            System.out.println(" given number is not armstrong " );
        } 
        
    }
    
}
