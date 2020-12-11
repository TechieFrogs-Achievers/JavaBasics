package Exceptions;

public class Exceptions13 
{
    public static void main(String[] args) 
    {
        //try catch block to handle arthematic exception
            try
             {
                int num1 = 4, num2 = 0;
                int val = num1 / num2;//possible for exception
                System.out.println(" value= " + val);
             }
             catch (ArithmeticException e) //handling arithmetic exception
            {
                System.out.println(e);
            }

    }
}
