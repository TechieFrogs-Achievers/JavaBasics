public class DocumentWisePrograms 
{
    //Swapping of two numbers using third variable
    public void swapProgram(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a +" "+b);
    }

    //swapping of two numbers without using third variable
    public void swappingProgram(int x, int y)
    {
        x= x+ y;
        y= x - y;
        x= x - y;
        System.out.println(x + "  "+y);
    }

    //finding whether the number is even or odd
    public void findingEvenOrOdd(int x)
    {
        if(x == 0)
        {
            System.out.println("The number is equal to zero ");
        }
        else if (x < 0)
        {
            if(x % 2 == 0)
            {
                System.out.println("The number is negative even number");
            }
            else
            {
                System.out.println("The number is negative odd number");
            }
            
        }

        else if(x % 2 == 0)
        {
            System.out.println("The number is even");
        }

        else if(x % 2 !=0)
        {
            System.out.println("The number is odd");
        }
    }

    //java program to check whether the alphabet is vowel or consonent
    public void checkingAlphabet(char s)
    {
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U' )
        {
            System.out.println("The character is vowel");
        }
        // else if(s == '0' || s > '0' || s < '0')
        //  {
        //      System.out.println("The character is number");
        //  }
        // else if(s == '-' || s == '+' || s == '=' || s == '_' || s == '&' || s == '*' || s == '^' || s == '%' || s == '$' || s == '#' || s == '@' || s == '!' || s == '?' || s == '/' || s == '.' || s == ',' || s == '<' || s == '>' || s == ':' || s == ';')
        // {
        //     System.out.println("The character is symbol");
        // }
        else
        {
            System.out.println("The character is consonent");
        }
    }

    //java program to check whether alphabet or not
    public void checkIsItAlphabetOrNot(char str)
    {
        int r=(char)str;
        System.out.println(r);
        if(r >= 65 && r <= 90 && r >= 97 && r <= 122)
        {
            System.out.println("The character is alphabet");
        }
        else if(r >=32 && r <=47 && r >= 58 && r <= 64 && r >= 91 && r<= 96 && r >= 123 && r <= 126 )
        {
            System.out.println("The character is symbol");
        }
        else if(r >=48 && r >= 57 )
        {
            System.out.println("The character is number");
        }
    }

    //factorial number program
    public void factorial(int number)
    {
        int i=1,fact=1;
        while(i <= number)
        {
            fact =fact * i;
            i++;

        }
        System.out.println(fact);
    }

    //program to sum of natural numbers
    public void sumOfNaturalNumbers(int number)
    {
        int sum = 0;
        for(int i = 0;i <= number; i++)
        {
            sum = sum + i;

        }
        System.out.println(sum);
    }

    //program to calculate GCD between two numbers
    public void gcdProgram(int number1, int number2)
    {
        int gcd= 1,lcm;
        for(int i=1; i <= number1 && i <= number2; i++)
        {
            if(number1 % i == 0 && number2 %i == 0)
            {
                gcd = i;
            }
                   
        }
        lcm= (number1 * number2) / gcd;
        System.out.println("GCD between two numbers is  " +gcd);
        System.out.println("LCM of two numbers is    "+lcm);
    }

    //java program to display A - Z  using loop
    public void displayAlphabets()
    {
        for(char ch= 65; ch <= 90; ch++)
        {
            System.out.print(ch +"  ");
        }
        System.out.println( );
        for(char ch=97; ch <= 122;ch++)
        {
            System.out.print(ch +"  ");
        }
        System.out.println( );
    } 

    //program to print prime number
    public void printPrimeNumber(int startingNumber, int endingNumber)
    {
        int count;
        for(int i=startingNumber; i<=endingNumber; i++)
        {
            count=0;
            for(int j=1; j <= i; j++)
            {
                if(i % j ==0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.print(i +"  ");
            }
        }
    }

    //java program to check whether number is armstrong number or not
    public void armstrongNumber(int number)
    {
        int sum=0,reminder,temp;
        temp= number;
        while(number > 0)
        {
            reminder = number % 10;
            sum =sum + reminder * reminder * reminder;
            number =number / 10;
        }
        if(sum == temp)
        {
            System.out.println(" \n The number is armstong    " +sum);
        }
        else
        {
            System.out.println(" \n The number is not a armstrong number");
        }
        
    }

    
    public static void main(String[] args) {
        DocumentWisePrograms dwp=new DocumentWisePrograms();
        dwp.swapProgram(3, 9);          //values passed to swapping of two numbers
        dwp.swappingProgram(10, 20);        //values passed to swapping of two numbers without using temprary variable
        dwp.findingEvenOrOdd(-21);          //values passed to finding even number or odd number
        dwp.checkingAlphabet('o');          //character passed to checking whether that character is alphabet or not
        dwp.checkIsItAlphabetOrNot('9');       //character passed to checking whether that character is alphabet or not
        dwp.factorial(2);                       //value passed for finding factorial of that number
        dwp.sumOfNaturalNumbers(5);              //value passed to calculating sum of natural numbers
        dwp.gcdProgram(4, 16);                      //two values passed to calculating gcd of that numbers
        dwp.displayAlphabets();                     //calling method 
        dwp.printPrimeNumber(10, 30);               //values passed to print prime numbers within that range 
        dwp.armstrongNumber(15);                    //value passed to chect that value is armstrong or not
    }
    
}
