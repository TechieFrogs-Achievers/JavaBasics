public class PrimeNumbers
 {
    public static void main(String[] args) 
    {
    
        int x=6;
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }

        }
        if(c==2)
        {
            System.out.println("Given number is prime number");
        }
        else
        {
            System.out.println("Given number is not a prime number");
        }
    }

}
