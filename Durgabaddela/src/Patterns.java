public class Patterns 
{
    public static void main(String[] args)
    {
        char k= 'A';
       //half pyramid

    /*  for(int i=1; i<=5; i++)
        {
          for(int j=1; j<=i; j++)
          {
              System.out.print("*");
          }
          System.out.println();
        }
     */
      //half pyramid using numbers

    /*  for(int i=1; i<=5; i++)
       {
          for(int j=1; j<=i; j++)
          {
              System.out.print(j);
          }
          System.out.println();
        }
    */


      //half pyramid using alphabets
    /*  for(int i=1; i<=5; i++)
        {
          for(int j=1; j<=i; j++)
          {
              System.out.print(k);
          }
              k++;
          
          System.out.println();
         }
    */
      //inverted half pyramid using *

    /*  for(int i=5; i>=1; i--)
        {
          for(int j=1; j<=i; j++)
          {
              System.out.print("*");
          }
          System.out.println();
        }
    */
      //inverted half pyramid using numbers

      for(int i=5; i>=1; i--)
      {
          for(int j=1; j<=i; j++)
          {
              System.out.print(j);
          }
          System.out.println();
      }

      //full pyramid using *

      for(int i=1; i<=5; i++)
      {
          for(int l=5; l>=i; l--)
          {
          System.out.print(" ");
          }
          for(int j=1; j<= (2*i-1); j++)
          {
              System.out.print("*");
          }
          System.out.println();
      }

      //inverted full pyramid using *

      for(int i=1; i<=5; i++)
      {
       for(int l=1; l<=i; l++)
       {
       System.out.print(" ");
       }
       for(int j=9; j >= (2*i-1); j--)
       {
           System.out.print("*");
       }
       System.out.println();
      }

       // Floyd's triangle
        int m =1;
      for(int i=1; i<=4; i++)
      {
       for(int j=1; j<=i; j++)
       {
           System.out.print(m);
           m++;
       }
       System.out.println();
     }

      //Diamond shape pattern
      for(int i=1; i<=8; i++)
      {
       for(int l=8; l>=i; l--)
       {
       System.out.print(" ");
       }
       for(int j=1; j<= (2*i-1); j++)
       {
           System.out.print("*");
       }
       System.out.println();
      }

      //Right pascal's triangle

      for(int i=1; i<=8; i++)
     {
       for(int l=1; l<=i; l++)
       {
        System.out.print(" ");
       }
      for(int j=15; j >= (2*i-1); j--)
       {
        System.out.print("*");
       }
         System.out.println();
     }

      for(int i=1; i<=8; i++)
      {
         for(int j=1; j<=i;  j++)
         {
                System.out.print(" *");
         }
         System.out.println();
       }
      for(int i=7; i>=1; i--)
       {
         for(int j=1; j<=i;  j++)
         {
                System.out.print(" *");
         }
         System.out.println();
       }

        //left pascal's triangle

       for(int i=1; i<=10; i++)
       {
         for(int l=10; l>=i; l--)
         {
         System.out.print(" ");
         }
         for(int j=1; j<=i; j++)
         {
           System.out.print("*");
         }
         System.out.println();
       }
       for(int i=1; i<=10; i++)
       {
         for(int l=1; l<=i; l++)
         {
         System.out.print(" ");
         }
         for(int j=9; j>=i; j--)
         {
           System.out.print("*");
         }
         System.out.println();
       }
     
         // sandglass star pattern
  
      for(int i=1; i<=5; i++)
      {
       for(int l=1; l<=i; l++)
       {
        System.out.print(" ");
       }
       for(int j=9; j >= (2*i-1); j--)
       {
          System.out.print("*");
       }
        System.out.println();
      }
      for(int i=1; i<=5; i++)
      {
       for(int l=5; l>=i; l--)
       {
        System.out.print(" ");
       }
       for(int j=1; j<= (2*i-1); j++)
       {
          System.out.print("*");
       }
        System.out.println();
      }

    }
}
