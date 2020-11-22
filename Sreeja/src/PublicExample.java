public class PublicExample 
{
    int number;
    int digit;


    public void sum()
    {
        int sum = number+digit;
        System.out.println(sum);
    }



     public static void main(String[] args) 
     {
        PublicExample pb = new PublicExample();
        pb.number = 6;
        pb.digit = 7;
        pb.sum();
       
       Average a = new Average();
        a.average(5,4,3);

    }
} 
