import java.util.*;
class Examples
{
public static void main (String[] args)
{
       int a=15,b=20,c,n=10;
       
       //addition of two integers
       c=a+b;
       System.out.println("addition of two inters is   " +  c);

       //proogram for / and %
       int dividend = 25, divisor = 4;
       int quotient = dividend / divisor;
       int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        //swaping of two numbers

        int x, y, t;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of X and Y");  
        x = sc.nextInt();  
        y = sc.nextInt();  
        /*swapping */  
        t = x;  
        x = y;  
        y = t;  
        System.out.println("After swapping: "+x +"   " + y);  
        System.out.println( );

        //even or odd

        System.out.println("Enter an integer to check if it's odd or even");
        n= sc.nextInt();
        if (n % 2 == 0)
        {
          System.out.println("The number is even.");
        }
        else
        {
          System.out.println("The number is odd.");
        }

        //factorial of a number

         int number=8,fact=1;
        int z = 1;
        while(z<=number)  // for(int z = 1; z <= number; z++)
        {
            fact = fact * z;
            z++;
        }
        System.out.println("Factorial of "+number+" is: "+fact); 

        //alphabet or not

        System.out.println("enter charecter");
        char ch =sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println("entered charecter is an alphabet");
        }
        else
        {
            System.out.println("entered charecter is not an alphabet");
        }

        //Gcd of two numbers

        int firstNumber=48,secondNumber=8;
        int hcf=(firstNumber>secondNumber) ? secondNumber : firstNumber;
        while(true)
        {
         if(firstNumber%hcf == 0 && secondNumber%hcf == 0 )
         {
          System.out.print("hcf is "+ hcf);
          break; 
         }
          hcf--;
        }
         System.out.println();
         int lcm=(firstNumber*secondNumber)/hcf;
         System.out.print("lcm is "+ lcm); 

          // Armstrong number

        int num=153,result=0 ,reminder=0;
        int temporyNumber=num;
        while(num>0)
        {
         reminder=num%10;
         result =result+(reminder*reminder*reminder);
         number=number/10;
        }
        if(temporyNumber == result) {
            System.out.println(temporyNumber + " is an armstrong number");
        } else {
            System.out.println(temporyNumber + " is not an armstrong number");
        }  

        /* //palindrome number

        int number=545,result=0 ,reminder=0;
        int palindromeNumber=number;
        while(number!=0)
        {
          reminder=number%10;
          result =result*10+(reminder);
          number=number/10;
        }
        if(palindromeNumber==result)
        {
          System.out.println(palindromeNumber +" is an palindrome number");
        }
        else
        {
         System.out.println(palindromeNumber +" is not an palindrome number");
        }   */
  

          



   

   



}
        
    
}