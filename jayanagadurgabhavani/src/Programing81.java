public class Programing81 
{
   // by used whileloop statement
    public static void main(String[] args) 
    {
        int number = 566;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
