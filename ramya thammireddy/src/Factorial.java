public class Factorial 
{
    

        public static void main(String args[])
        { 
    
            int number = 5;
            long fact = 1;
            for(int i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
        
}
//using while loop

public class Demo1
{

    public static void main(String args[]) 
    {

        int number = 5;
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