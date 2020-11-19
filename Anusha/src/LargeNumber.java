import javax.lang.model.util.ElementScanner14;

public class LargeNumber
{
    //find the laegest numberin three numbers
    public static void main(String[] args)
    {
        int num1=45,num2=45,num3=45;
        if(num1>num2 && num1>num3)
        {
          System.out.println("given number1 is largest number:");
        }
        else if(num2>num1 && num2>num3)
        {
          System.out.println("given number2 is largest number:");
        }
        else if(num3>num1 && num3>num2)
        {
          System.out.println("given number3 is largest number:");
        }
        else 
        {
            System.out.println("all are equal");
        }
        
    }
    
}
