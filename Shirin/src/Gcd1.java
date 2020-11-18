public class Gcd1 
{
    public static void main(String[] args) 
    {
        int v1 = 5 , v2 = 12;
        int g = 1 ;
        

        // using for loop 
        for ( int i = 1; i <= v1 ; i ++)
        {
            System.out.println(v1 + " *" +i+ " = " + v1 *i);
        }


        // using while loop

        while (g <= v2)
        {
            System.out.println( v2 + " * " +g+ " = " + v2* g);
            g++;

        }
        
    }
    
}
