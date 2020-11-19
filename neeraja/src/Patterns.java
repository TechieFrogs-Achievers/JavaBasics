import java.util.*;
public class Patterns 
{
public static void main(String... tf)
{
    Scanner sc=new Scanner(System.in);
   /* // (29 a) patern
    for(int i=1; i<=5; i++)
    {
        for(int j=5; j>=i; j--)
        {
            System.out.print("  ");
        }
         for(int k=1; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
     }  
     
     //(29 b) pattern
     for(int i=1; i<=5; i++)
    {
        for(int j=1; j<=i; j++)
        {

            System.out.print(" ");
        }
         for(int k=5; k>=i ; k--)
            {
                System.out.print(" *");
            }
            System.out.println();
     }  */

   /*  //(27)  full rhombus
     for(int i=1; i<=5; i++)
    {
        for(int j=5; j>=i; j--)

        {

            System.out.print(" ");
        }
         for(int k=1; k<=2*i-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     //down pattern
     for(int i=1; i<=5; i++)
     {
     for(int j=1; j<=i; j++)
        {

            System.out.print(" ");
        }
         for(int k=9; k>=2*i-1 ; k--)
            {
                System.out.print("*");
            }
            System.out.println();
     }  */

    /* // (31) home pattern
     for(int i=1; i<=5; i++)
     {
         for(int j=5; j>=i; j--)
         {
 
             System.out.print(" ");
         }
          for(int k=1; k<=2*i-1 ; k++)
             {
                 System.out.print("*");
             }
             System.out.println();
    }
     for(int i=1; i<=7; i++)//for rows
     {
     for(int j=1; j<=11; j++)//for columns
        {
         System.out.print("*");
        }
        System.out.println();
    }  */

 /*// (30)  reverdes rhombus

for(int i=1; i<=5; i++)
     {
     for(int j=1; j<=i; j++)
        {

            System.out.print(" ");
        }
         for(int k=9; k>=2*i-1 ; k--)
            {
                System.out.print("*");
            }
            System.out.println();
     }  

     for(int i=1; i<=5; i++)
    {
        for(int j=5; j>=i; j--)
        {

            System.out.print(" ");
        }
         for(int k=1; k<=2*i-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }  */
    

         /* // (28 a) patern
    for(int i=1; i<=5; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
         
            System.out.println();
     }  
     
     //(28 b) pattern
     for(int i=1; i<=5; i++)
    {
        for(int j=5; j>=i; j--)
        {

            System.out.print("*");
        }
         
            System.out.println();
     }   */

     /* //26 (if u print j by removing 
     //variable k ,we get 18th pattern) 
      int k=1;
     for(int i=1; i<=5; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(k);
            k++;
        }
          System.out.println();
    }   */

   /* // 19 th pattern
    char k='A';
    for(int i=1; i<=5; i++)
    {
        
        for(int j=1; j<=i; j++)
        {
            System.out.print(k);
        
        }
        k++;
          System.out.println();
    }     */

    /*//(25) pascals traingle
    int n=5,  k=1;
for(int i=0; i<n; i++)
{
    for(int p=1; p<=n-i; p++)
    {
        System.out.println(" ");
    }
    for(int j=0; j<=i; j++)
    {
        if(j==0 || i==0)
        {
            k=1;
        }
        else
        {
            k=k*(i-j+1)/j;
        }
        System.out.print(" "+k);
    }
    System.out.println();

} */

 /*// table printing
int num = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n",num,i, num * i);
            
            i++;
        }
  */

   /* // Armstrong number
  int number=153,result=0 ,reminder=0;
   int temporaryNumber=number;
   while(number>0)
   {
     reminder=number%10;
     result =result+(reminder*reminder*reminder);
     number=number/10;
   }
   if(temporaryNumber==result)
   {
       System.out.println(temporaryNumber +" is an armstrong number");
   }
   else
   {
    System.out.println(temporaryNumber +" is not an armstrong number");
   }  */

    /*//palindrome number
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

   /* //prime number
   int number=7, count=0;
   if(number>0)
   {
       for(int i=1; i<=number ;i++)
       {
           if(number%i==0)
           {
               count++;
           }
       }
       if(count==2)
       {
       System.out.println(number + "is prime number");
       }
       else
       {
        System.out.println(number + "is  not a prime number");
       }  
   }  */

   /* // to print A TO Z ,(a to z)
   char alphabet;
   for(alphabet='A'; alphabet<='Z'; alphabet++ )
   {
       System.out.print(alphabet +" ");
   }
   System.out.println();

   for(alphabet='a'; alphabet<='z'; alphabet++ )
   {
       System.out.print(alphabet +" ");
   }  */

   /* //GCD OF TWO NUMBERS
   int firstNumber=20,secondNumber=28;
   int hcf=(firstNumber>secondNumber) ? secondNumber : firstNumber;
   while(true)
   {
       if(firstNumber%hcf==0 && secondNumber%hcf==0 )
       {
        System.out.print("hcf is "+ hcf);
        break; 
       }
       hcf--;
   }
   System.out.println();
   int lcm=(firstNumber*secondNumber)/hcf;
   System.out.print("lcm is "+ lcm);   */

  /* //sum of natural numbers
   int number=250, sum=0;
   for(int i=1; i<=number; i++)
   {
     sum=sum+i;
   }
   System.out.print("sum of natural numbers  is "+ sum); 
    */

    /* //factorial of a number
    int number=6,fact=1;
    int i = 1;
        while(i<=number)  // for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact); */

         /*//alphabet or not
        System.out.println("enter charecter");
        char charecter=sc.next().charAt(0);
        if(charecter=='a' && charecter=='z' ||charecter=='A' && charecter=='Z')
        {
            System.out.println("entered charecter is an alphabet");
        }
        else
        {
            System.out.println("entered charecter is not an alphabet");
        }  */

        //largest no among 3 numberas
        int a, b, c, d;
        System.out.println("Enter all three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);

        // 
    }
}


