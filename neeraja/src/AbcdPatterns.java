public class AbcdPatterns 
{
    public static void main(String[] uj)
    {
       /*  // (1)for loop to print rows
        for(int i=1; i<=8; i++)
        {
            // initializing a variable
            char k='A';
            // for loop to print columns
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
    }  */

  
    /*//(2)
    char k='A';
    for(int i=1; i<=6; i++)
     {
         // initializing a variable
        
        // for loop to print columns
        for(int j=1; j<=i; j++)
        {
          System.out.print(k);
               
        }
         k++;
        System.out.println();
    }  */

    /* //(3)
    for(int i=1; i<=6; i++)
        {
            // initializing a variable
            char k='A';
            // for loop to print columns
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--)
        {
            char k='A';
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        } */

        /*// (5)
        char i,j;
        for( j='F'; j>='A'; j--)
        {
             for(  i=j; i>='A'; i--)
            {
               System.out.print(i);
            }
            System.out.println();
         }
         for( j='A'; j<='F'; j++)
        {
             for(  i=j; i>='A'; i--)
            {
               System.out.print(i);
            }
            System.out.println();
         }
     */

    /* //(6) 
     char i,j,k;
     for(i='A'; i<='F'; i++)
     {
         for(k='F'; k>=i; k--)
         {
             System.out.print(" ");
         }
         for(j='A'; j<=i; j++)
         {
             System.out.print(" "+j);
         }
         System.out.println();
    }    */

    /*// (7) pattern

    char i,j;
    for( j='A'; j<='F'; j++)
    {
         for(  i='F'; i>=j; i--)
        {
           System.out.print(i);
        }
        System.out.println();
     }
          */

     /*     //(8)
          char i,j;
    for( j='F'; j>='A'; j--)
    {
         for(  i='F'; i>=j; i--)
        {
           System.out.print(i);
        }
        System.out.println();
     }    */

    /* //(9)
     char i,j;
    for( j='F'; j>='A'; j--)
    {
         for(  i='A'; i<=j; i++)
        {
           System.out.print(i);
        }
        System.out.println();
     }   */

    /* //(10)
     char k='A';
    for( int j=1; j<=6; j++)
    {
         for(int i=1; i<=j; i++)
        {
           System.out.print(k);
           k++;
        }
        System.out.println();
     }  */

    /* // (11)
    
    for( char i='A'; i<='F'; i++)
    {
         for(char j=i; j>='A'; j--)
        {
           System.out.print(j);
        }
        
        System.out.println();
    }   */

   /*  //  (12)
    char z=65;
    for(int  i=0; i<=5; i++)
    {
        int k=i;
        for(int j=i; j>=0; j--)
        {
             
                System.out.print((char) (z+k));
                k+=5;
            }
         System.out.println();
        }  */

      /*//13th pattern
     int coeff=0;
     for(int x=0; x<=6; x++)
     {
         
         for(int y=0; y<=x; y++)
         {
             if(y==0 ||x==0)
             {
                  coeff=1;
             }
             else
             {
              coeff=coeff*(x-y+1)/y;
             }
             System.out.print((char)(coeff+64));
         }
         System.out.println();
            
         
     } */
 
 
    /* //14th pattern
 
     for(int x=1;x<=6;x++)
     {
         for(int y=1;y<=x;y++)
         {
             System.out.print((char)(y+64)+" ");
         }       
         for(int y=x-1;y>=1;y--)
         {
             System.out.print((char)(y+64)+" ");
         }
         System.out.println();
     }  */
 
    
         /*//(15)
         char i,j;
         for( i='F'; i>='A'; i--)
         {
             for( j='F'; j>=i; j--)
             {
                 System.out.print(" ");
                 
             }
             for( j='A'; j<=i; j++)
             {
                 System.out.print(" "+j);
                 
             }
             
             System.out.println();
         }   */

        /* // (16) 
     char i,j,k;
     for(i='A'; i<='F'; i++)
     {
         for(k='F'; k>=i; k--)
         {
             System.out.print(" ");
         }
         for(j='A'; j<=i; j++)
         {
             System.out.print(" "+j);
         }
         System.out.println();
    }    
    for( i='F'; i>='A'; i--)
         {
             for( j='F'; j>=i; j--)
             {
                 System.out.print(" ");
                 
             }
             for( j='A'; j<=i; j++)
             {
                 System.out.print(" "+j);
                 
             }
             
             System.out.println();
         }     */

      /*  //(17)
         char i,j,k;
         for( i='A'; i<='F'; i++)
    {
        for( j='A'; j<=i; j++)
        {

            System.out.print(" ");
        }
         for( k=i; k<='F' ; k++)
            {
                System.out.print(k);
            }
            System.out.println();
     } 
     for( j='F'; j>='A'; j--)
     { 
       for( i='A'; i<=j; i++)
         {
           System.out.print(" ");
           }
          for( k=j; k<='F' ; k++)
             {
                 System.out.print(k);
             }
             System.out.println();
      }  */

    /*  //(18)
         char i,j,k;
      for( i='A'; i<='F'; i++)
      {
        for( k=i; k<='F' ; k++)
        {
          System.out.print(k);
         }
         System.out.println();
       }  
    for( j='F'; j>='A'; j--)
     { 
          for( k=j; k<='F' ; k++)
             {
                 System.out.print(k);
             }
             System.out.println();
      }  */


     /* // (19)
      char j,k;
      for( j='F'; j>='A'; j--)
     { 
          for( k=j; k<='F' ; k++)
             {
                 System.out.print(k);
             }
             System.out.println();
      }   */
  }
    }
     