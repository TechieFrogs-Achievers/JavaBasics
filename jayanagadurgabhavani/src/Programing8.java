public class Programing8 
{
//usig of for statement
    public static void main(String[] args) 
    {
         int number = 566;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
