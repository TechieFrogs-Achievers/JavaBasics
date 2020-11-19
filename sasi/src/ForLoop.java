public class ForLoop 
{
    public static void main(String[] args) 
    {

        int count = 5, n1= 0, n2 = 1;

        for (int i = 1; i <= count; i++)
        {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println("fibbanocci number:"+n2);
        }
    }
    
}
