import java.util.*;
public class NotyPatterns 
{
    public static void main(String[] hb)
    {
        Scanner sc=new Scanner(System.in);
    
    /*     // 1 pattern
    for(int i=1; i<=5; i++)
    {
        for(int j=5; j>=1; j--)
        {
            if(j==i)
            {
                System.out.print("*");
            }
            else
            {
            System.out.print(j);
            }
        }
        System.out.println();
    }  */

     /*//3 pattern
    for(int i=1; i<=4; i++)
    {
        for(int j=1; j<=9; j++)
        {
            if(j==i ||j==5 ||i+j=10)
            {
                System.out.print("*");
            }
            else
            {
            System.out.print("0");
            }
        }
        System.out.println();

    } */

    /* // 4th pattern
    System.out.println("enter n :");
    int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(" "+i*j);
        }
        System.out.println();
    }  */

   /*// 5th pattern 
    System.out.println("enter n :");
    int n=sc.nextInt();
    for(int i=1; i<=(n+1)/2; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==j || i+j==n+1)
            {
                System.out.print(i);
            }
            else
            {
                  System.out.print(" ");
            }
        }
             System.out.println();
     }
     for(int i=3; i>=1; i--)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==j || i+j==n+1)
            {
                System.out.print(i);
            }
            else
             {
                  System.out.print(" ");
            }
        }
             System.out.println();
     }  */

     /*  // 7th pattern
     for(int i=4; i>=1; i--)
    {
         for(int j=1; j<=4; j++)
        {
            if(j<=i)
            {
            System.out.print(j);
            }
            else
            System.out.print("*");
        }
        for( int j=4; j>=1; j--)
        {
            if(j<=i)
            {
              System.out.print(j);
            }
            else
            System.out.print("*");
         } 
           System.out.println();
    }  */


      /*//9th pattern
     System.out.println("enter n :");
     int n=sc.nextInt(); 
     for(int j=1; j<=n; j++)
    { 
        for(int i=1; i<=n; i++)
        {
            if(i==1||i==n ||j==1 ||j==n)
            {
                System.out.print("1");
            }
            else
             {
                  System.out.print(" ");
            }
        }
             System.out.println();
     }  */

     /* // 11th pattern
     System.out.println("enter n :");
     int n=sc.nextInt();
     char c='a';
     String s= "(";
     for(int i=1; i<=n; i++)
    {
         s=s+String.valueOf(c);
         System.out.println( s + ")");
        c++;
        s=s+"+";
        } */

       /* //12th pattern
        String s1="HELLO";
        String s2="WORLD";
        
        int i=5;
           for(int j=0; j<=6; j++)
           {
               System.out.println();
               System.out.print( s1.substring(0,j+1)+" "+s2.substring(0,i) );
           i--;
           } */
           
        

       /* //13 th pattern
        System.out.println("enter n :");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            char z='a';
            for(int k=5; k>=i ; k--)
            {
                System.out.print(z);
            }
            z++;
            System.out.println();
           
        }  */

       /* // 16th pattern
        String name="ISTS";
        for(int i=0; i<=name.length()-1; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        } */

    /*  // 15th pattern

     for(int i=1; i<=6; i++)
    {
        for(int j=1; j<=6; j++)
        {
            if(j==1 || j==6 )
            {
                System.out.print(i);
            }
            else if(i==j)
            {
            System.out.print(j);
            }
            else 
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
 */ 

 // 14th pattern
 for(int i=1; i<=4; i++)
    {
        char c='a';
        for(int j=4; j>=i; j--)
        {
            
            System.out.print(c);
            ++c;
         }
         System.out.print(" ");
         
         for(int k=4; k>=i; k--)
         {
             
             System.out.print(--c);
         }
         System.out.println();
    }  
    for(int i=1; i<=3; i++)
     {
         char c='a';
         for(int k=2; k>=i; k--)
         {
             
             System.out.print(c++);
         }
         System.out.print(" ");
         for(int j=2; j>=i; j--)
         {
             
             System.out.print(--c);
             
          }
          System.out.println();
    }
  


        
    

}
}