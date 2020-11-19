public class Palindrome
 {
     public static void main(String[] args)
      {
        int reverse=0;
        int number= 545;
        int number1=number;

        while(number>0)
        {
            int remainder=number%10;
            reverse = reverse*10+remainder;
            number=number/10;
        }
        if(number1==reverse)
        {
            System.out.println("Given number is palindrome");
        }
        else
        {
            System.out.println("Given number is not palindrome");
        }
    }
}
