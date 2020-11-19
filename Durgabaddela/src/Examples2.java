import java.util.*;

public class Examples2 
{
    public static void main(String[] args)
    { 
       //1 st pattern
    /* for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=1; j--)
            {
                if(i==j)
                {
                 System.out.print("*");
                }
                else
                {
                 System.out.print(j);
                }

            }
          System.out.println();
            
        }
    */

        //3rd pattern

    /* for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=9; j++)
            {
                if(i==j||j==5||i+j==10)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    */

        //4 th pattern
    /* for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {
               System.out.print(" " + i*j);
            }
            System.out.println();
        }
    */

        //5th pattern
    /*  for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=7; j++)
            {
                if(i==j || i+j==8)
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
            for(int j=1; j<=7; j++)
            {
              if(i==j || i+j==8)
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
    */

         // 7 th pattern

    /* for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=4; j++)
            {
              if(i+j == 6 || i+j>=7)
              {
                  System.out.print("*");
              }
              else
              {
                 System.out.print(j);
              }
            }
              System.out.println();
        }   
        for(int i=4; i>=1; i--)
        {
            for(int j=1; j<=4; j++)
            {
              if(i+j == 4 || i+j<=3)
              {
                  System.out.print("*");
              }
              else
              {
                 System.out.print(j);
              }
            }
              System.out.println();
       
        } 
    */

        // 9th pattern

    /*     Scanner sc = new Scanner(System.in);
         System.out.println("enter the n value");
         int n = sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    */

        //11 th pattern

    /*  char c='a';
        String s="(";
         for(int i=1; i<=n; i++)
         {
             s=s+String.valueOf(c);
             System.out.println(s+")");
             c++;
            s=s+ "+";
         }
     */

         //12th pattern
    /* String s1= "HELLO", s2= "WORLD";
         for(int i=0,j=5; i<=5; i++,j--)
         {
             {
                 System.out.println();
                 System.out.print(s1.substring(0,i+1) +" "+ s2.substring(0,j));
                 
                 
             }
         }
     */

         //13th pattern

    /*     char ch = 'a';
         for(int i=1; i<=5; i++)
         {
             for(int j=1;j<=i; j++)
             {
                 System.out.print(i);
             }
             for(int j=5;j>=i;j--)
             {
              System.out.print(ch);
             }
               ch++;
               System.out.println();

         } 
    */

         //15th pattern

    /*     for(int i=1; i<=6; i++)
         {
             for(int j=1; j<=6; j++)
             {
                 if( j==1 || j==6)
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

          //16th pattern
         
         String s="ISTS";
          for(int i=0; i<=4; i++)
          {
              System.out.print(s.substring(0,i)+" ");
              System.out.println();
          }
 

        
                    
    }
}
