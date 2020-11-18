public class Palindrome 
{
    public static void main(String[] args)
    {
        int n = 121;
        int num = 0 ,reverse , temp;
        temp = n;
        while ( n > 0)
        {
            reverse = n % 10 ;
            num = (num *10)+ reverse;
            n = n / 10;

        }
        if (temp == num)
        {
            System.out.println(" Given number is palindrome");
        }
        else 
        {
            System.out.println(" Given number is not a palindrome");
        }
        
    }
    
}
