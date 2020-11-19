public class Programing11 
{
    // by used in foe loop statement 
    public static void main(String[] args) 
    {
        int num1 = 566, num2 = 528, gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }
}
