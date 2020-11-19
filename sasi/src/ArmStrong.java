public class ArmStrong 
{
    public static void main(String[] args) 
    {
        int num = 133, n, temp, total = 0;

        n = num;
        while (n != 0)
        {
            temp = n % 10;
            total = total + temp*temp*temp;
            n = n/10;
        }

        if(total == num)
        {
            System.out.println( " is an Armstrong number"+num);
        }
        else
        {
            System.out.println(" is not an Armstrong number"+num);
        }
    }

    
}
