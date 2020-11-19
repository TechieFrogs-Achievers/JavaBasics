public class ArmStrong 
{
    public static void main(String[] args)
     {
        int number = 777;
        int armStrong = 0;
        int number1=number;

        while(number>0)
        {
            int remainder = number%10;
            armStrong = armStrong+remainder*remainder*remainder;
            number = number/10;

        }
        if(number1==armStrong)
        {
            System.out.println("Given number is Armstrong number");
        }
        else
        {
            System.out.println("Given number is not Armstrong number");
        }
        }
    }

