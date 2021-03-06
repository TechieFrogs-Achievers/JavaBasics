public class Assignment1 
{
   /* 1. Adding of two numbers
   public static int add(int a, int b) // calling a method
    {
        int c = a + b ;  // Adding of two numbers
        return c ;
    }
    public static void main(String []args)
    {
        int sum = add ( 28 , 41 );
        System.out.println(sum);
    } */



   /* 2. finding remainder and quotient
   public static float rem (float a , float b) // calling a method
    {
        float c = a % b ; // finding remainder
        return c;
    }
    public static float quo ( float d, float e)
    {
        float f = d / e ; // finding quotient
        return f ;
    }
    public static void main(String[] args)
    {
        float remainder = rem ( 10 , 15);
        System.out.println("Remainder = " + remainder);
        float quotient = quo ( 25 , 30 );
        System.out.println("Quotient = " + quotient);
    }*/



    /* 3. Swapping of two numbers
    public static void main(String[] args) 
    {
        int a = 28 ;
        int b = 41 ;
        int c = a ; // swapping of two numbers
        a = b ;
        b = c ;
        System.out.println(a + "  " + b);
    } */


   /* 4. Even or Odd
   public static void main(String []args)
    {
        int num = 57 ; // initialising variable
        String a = "Even" ;
        String b = "Odd" ;
        String output = (num % 2 == 0) ? a : b ; // checking whether even or odd
        System.out.println(output);
    } */



    /* 5. Vowel or Consonant
   public static void main(String []args)
    {
        char ch = 'V' ;
        if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') // checking whether given alphabet is a vowel
        System.out.println("Given alphabet is Vowel");
        else
        System.out.println("Given alphabet is Consonant");
    } */



    /* 6. Largest among three
    public static void main(String[] args)
    {
        int a = 52 , b = 69 , c = 96 ;
        if(a > b && a > c)
        System.out.println(a + " is largest among three");
        else if (b > a && b > c)
        System.out.println(b + " is largest among three");
        else 
        System.out.println(c + " is largest among three"); 
    } */


    /* 7. Given character is Alphaber or not
    public static void main(String []args)
    {
        char ch = '^' ;
        if (( (int) ch >= 97 && (int) ch <= 122) || ((int) ch >= 65 && (int) ch <= 90)) // checking whether input is alphabet or not
        System.out.println("Given character is Alphabet");
        else 
        System.out.println("Given character is not an Alphabet");
    } */


    /* 8. Factorial of a number 
    public static void main(String []args)
    {
        int i = 1, n = 4 , fact = 1 ;
        while ( i <= n )
        {
            fact*=n ;
            n-- ;
        }
        System.out.println("Factorial of n = " + fact);
    } */


    /* 9. Sum of N natural numbers
    public static void main (String []args)
    {
        int i = 1 , sum = 0 , num = 15 ;
        while ( i<=num )
        {
            sum += num ;
            num-- ; 
        }
        System.out.println("The sum of natural numbers is " + sum);
    } */



    /* 10. Multiplication Table using While
    public static void main (String []args)
    {
        int i = 1 , n = 9 , mul = 1 ;
        while ( i <= 10 )
        {
            mul = i * n ;
            System.out.println( i + " * " + n + " = " + mul );
            i++ ;
        }
    } */ 


    /* 11. GCD of two numbers 
    public static void main(String []args)
    {
        int gcd = 1 ;
        int n1 = 6 , n2 = 9 ;
        int n3 = ( n1 < n2 )? n1 : n2 ; // checking which is smaller
        for(int i = 1 ; i <= n3 ; i++ )
        {
            if ( n1 % 1 == 0 && n2 % i ==0 ) // checking whether the number is divisible by both the given inputs
            {
                gcd = i ;
            }
        }
        System.out.println("GCD of two numbers is " + gcd);
    } */



    //12. LCM of two numbers
    /*public static void main (String []args)
    {
        int LCM = 1 ;
        int n1 = 24 , n2 = 16;
        int n3 = n1 * n2 ; // maximum limit of lcm
        int n4 = ( n1 > n2 ) ? n1 : n2 ; // minimum limit of lcm i.e., largest among two
        for ( int i = n4 ; i <= n3 ; i++ )
        {
            if ( i % n1 == 0 && i % n2 == 0 )
            {
                LCM = i ;
                break ;
            }
        }
        System.out.println("LCM of two numbers is " + LCM );
    } */



    /* 13. Printing Alphabets in Capital and small letters
    public static void main (String []args)
    {
        for ( int i = 65 ; i <= 90 ; i++)
        {
            System.out.print((char) i ); // converting int to string using ascii values
        }
        System.out.println();
        for (int j = 97 ; j <= 122 ; j++)
        {
            System.out.print((char) j );
        }
    } */



    /* 14. Whether prime or not
    public static void main (String []args)
    {
        int num = 28 ;
        int count =0 ; // number of factors that the given input is having
        for( int i = 2 ; i<= num/2 ; i++ )
        {
            if ( num % i == 0 )
            {
                count++ ;
            }
        }
        if( count == 0 )  // no factors
        System.out.println("Given number is a Prime number");
        else 
        System.out.println("Given number is not a Prime number");
    } */
    
    
    
    /* 15. Whether Palindrome or not
    public static void main(String []args)
    {
        int num = 74147 ;
        int rem = 0 , sum = 0 ;
        int temp = num ;
        while ( num > 0 )  // reversing a number
        {
            rem = num % 10 ;
            sum = sum * 10 + rem ;
            num = num / 10 ;
        }
        if( temp == sum )
        {
            System.out.println("Given number is a Palindrome" );
        }
        else 
        System.out.println("Given number is not a Palindrome");

    } */



    /* 16. Armstrong or not
    public static void main (String []args)
    {
        int num = 151 ;
        int arm = 0 , rem = 0 ;
        int temp = num;
        while ( num > 0 )  // calculating sum of cubes of each digit
        {
            rem = num % 10 ;
            arm = arm + (rem * rem * rem) ;
            num = num / 10 ;
        }
        if ( temp == arm )
        {
            System.out.println("Given number is an Armstrong");
        }
        else 
        System.out.println("Given number is not an Armstrong");
    } */



    /* 17. Pyramid with *
    public static void main (String[] args)
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } */



    /* 18. Pyramid using numbers
    public static void main(String []args)
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    } */




    /* 19. Pyramid using Alphabets
    public static void main(String []args)
    {
        for(int i = 65 ; i <= 69 ; i++)
        {
            for(int j = 65 ; j <= i ; j++)
            {
                System.out.print((char) i );
            }
            System.out.println();
        }
    } */ 


    
    /* 20. Inverted pyramid using *
    public static void main(String []args)
    {
        for(int i = 1; i <= 5; i++)
        {
            for (int j = 5 ; j>= i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } */




    /* 21. Inverted pyramid using numbers 
    public static void main(String []args)
    {
        for(int i = 5 ; i >= 1 ; i-- )
        {
            for (int j = 1 ; j <= i ; j++ )
            {
                System.out.print(j);
            }
            System.out.println();
        }
    } */



    /*public static void main(String[] args)
    {
        int k = 0 ;
        for ( int i = 1 ; i <= 5 ; ++i , k = 0 )
        {
            for ( int space = 1 ; space <= 4 ; ++space )
            {
                System.out.print(" ");
            }
            while (k != 2 * i - 1 )
            {
                System.out.print(" * ");
                k++ ;
            }
            System.out.println();
        }
    }   */



    /*public static void main (String[] args) 
    {
        for (int i = 1; i <= 4; i++)
        {
            int rows = 5 ;
            for (int j = 1; j <= rows - i ; j++) 
            { 
                System.out.print(" ");
            }
            for ( int k = i ; k >= 1  ; k-- )
            {
                System.out.print(k);
            }
            for (int l = 2 ; l <= i ; l++)
            { 
                System.out.print(l); 
            } 
            System.out.println(); 
        }
    } */

    
    
     //24. Inverted pyramid with * 
    /*public static void main(String[] args)  
    {  
        int rows=8;  
        for (int i= 0; i<= rows-1; i++)  
        {  
            for (int j=0; j<=i; j++)  
            {  
                System.out.print(" ");  
            }  
            for (int k=0; k<=rows-1-i; k++)  
            {  
                System.out.print("*" + " ");  
            }  
             System.out.println();  
        }  
    }  */


    // 25. Pascal's Triangle
    /*public static void main(String []args)
    {
        int n = 5 ;    //n is the number of rows you want to print  
        for (int i = 0 ; i < n ; i++)   
        {  
            int num = 1;  
            System.out.printf("%" + (n - i) * 2 + "s", "");  
            for (int j = 0; j <= i; j++)   
            {  
                System.out.printf("%4d", num );  
                num = num * (i - j) / (j + 1);  
            }  
            System.out.println();  
        }
    } */



    // 26. Floyd triangle
    /*public static void main(String []args)
    {
        int k = 1 ;
        for ( int i = 1 ; i <= 4 ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }*/




    //27. Diamond Pattern with *
    /*public static void main(String args[])  
    {  
        int rows = 8 , i, j, space = 1;    
        space = rows - 1;  
        for (j = 1; j <= rows ; j++)  
        {  
            for (i = 1; i <= space ; i++)  
            {  
                System.out.print(" ");  
            }  
        space--;  
        for (i = 1; i <= 2 * j - 1; i++)  
        {  
            System.out.print("*");  
        }  
        System.out.println("");  
    }  
    space = 1;  
    for (j = 1 ; j <= rows - 1 ; j++)  
    {  
        for (i = 1 ; i <= space ; i++)  
        {  
            System.out.print(" ");  
        }  
        space++;  
        for (i = 1 ; i <= 2 * (rows - j) - 1 ; i++)  
        {  
            System.out.print("*");  
        }  
    System.out.println("");  
    }  
} */




// 28. Right Pascal's Triangle
/*public static void main (String []args)
{          
    for ( int i = 1 ; i <= 8 ; i++)  
    {  
        for (int j = 1 ; j <= i ; j++)   
        {  
            System.out.print("*"+ " ");  
        }   
        System.out.println();   
    }   
    for (int  i = 7 ; i >= 1 ; i--)  
    {  
        for( int j = 0 ; j <= i-1 ; j++)  
        {  
            System.out.print("*"+ " ");  
        }  
        System.out.println("");  
    }  
} */



// 29. Left Pascal's Triangle
/*public static void main(String[] args)  
{  
    int i, j, k, rows = 10 ;         
    for (i= 1; i<= rows ; i++)  
    {  
        for ( j = i ; j < rows ; j++)              
        {  
            System.out.print(" ");  
        }  
        for  ( k =1 ; k <= i ; k++)   
        {  
            System.out.print("*");   
        }   
        System.out.println("");   
    }   
    for ( i = rows; i >= 1 ; i--)  
    {  
        for( j = i ; j <= rows ; j++)  
        {  
            System.out.print(" ");  
        }  
        for( k = 1 ; k < i ; k++)   
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
} */      



// 30. Sandglass Star Pattern
/*public static void main(String[] args)  
{  
    int i, j, k, n = 10 ;           
    for (i= 0; i<= n-1 ; i++)  
    {  
        for (j=0; j<i; j++)  
        {  
            System.out.print(" ");  
        }  
    for (k=i; k<=n-1; k++)   
        {   
            System.out.print("*" + " ");   
        }   
        System.out.println("");   
    }   
    for (i= n-1; i>= 0; i--)  
    {  
        for (j=0; j<i; j++)  
        {  
            System.out.print(" ");  
        }  
        for (k=i; k<=n-1; k++)  
        {  
            System.out.print("*" + " ");  
        }  
    System.out.println("");  
    }
}  */


    
}
