public class DoWhileLoop 
{
    public static void main(String[] args)
    {
        int i =0, sum =0;
        float avg=0.0f;
        do 
        {
            sum =sum + i;
            i++;
        }
        while (i<=10);

        avg = sum /10;   //average of 10 numbers

        System.out.println(avg);  //prints avg value
    }
}
