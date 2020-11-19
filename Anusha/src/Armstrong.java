public class Armstrong
{
    public static void main(String[] args)
    {
        int number = 371, originalnumber,  remainder, cube, sum=0;
        originalnumber=number;
        
        while (originalnumber > 0)
        {
            //remainder constains the last digit
            remainder = originalnumber % 10;//371 % 10 = 1
            cube = remainder *remainder * remainder; //1
            sum+=cube;//0+1=1
            originalnumber /= 10;//371/10=37
        }

        if(sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
      
    }
}
