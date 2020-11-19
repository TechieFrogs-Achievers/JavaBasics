public class TernaryOperator 
{
    public static void main(String args[])
    {
        int n=0;
        String data = (n>0) ? ((n%2 == 0) ? "Even":"odd") :"Invalid output";
        System.out.println(data);
    }
}
