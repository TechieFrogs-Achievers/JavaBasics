import java.util.Scanner;

public class Patterns2 
{
public static void main(String[] args)
{
    char i, j, l;
   // 1st pattens
    
/*  for( i='A'; i<='F'; i++)
    {
        for( j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
 
    }
*/

/* //2nd pattern

    for(i='A'; i<='F'; i++)
    {
        for(j='A'; j<=i; j++)
        {
            System.out.print(i);
        }
        System.out.println();
 
    }
*/

/* // 3rd pattern

    for( i='A'; i<='F'; i++)
    {
        for( j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    for( i='E'; i>='A'; i--)
    {
        for( j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
          System.out.println();
    }

*/

/* // 4th pattern

    for( i='E'; i>='A'; i--)
    {
        for( j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    for( i='A'; i<='F'; i++)
    {
        for( j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/

/* //5th pattern

    for( i='F'; i>='A'; i--)
    {
        for( j=i; j>='A'; j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    for( i='A'; i<='E'; i++)
    {
        for( j=i; j>='A'; j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/

/* // 6th pattern

    for( i='A'; i<='F'; i++)
    {
        for( l='F'; l>=i; l--)
        {
            System.out.print(" ") ;
        }
        for( j='A';j<=i; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
*/

    // 7th pattern
/*  for(i='A'; i<='F'; i++)
    {
        for( j='F'; j>=i; j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/
    
    // 8th pattern

/*  for(i='F'; i>='A'; i--)
    {
        for(j='F'; j>=i; j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/

    // 9th pattern

/* for(i='F'; i>='A'; i--)
    {
        for(j='A'; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/

    //10th pattern

 /* for( i='A'; i<='F'; i++)
    {
        char k='A';
        for(j='A'; j<=i; j++)
        {
            System.out.print(k);
            k++;
        }
        
        System.out.println();
    }
    */
    


    //11th pattern

/*  for(i='A'; i<='F'; i++)
    {
        for(j=i; j>='A'; j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/

    //12th pattern

/* for(i='A'; i<='F'; i++)
    {
        char c=i;
        for(j=i; j>='A'; j--)
        {
            System.out.print(c);
            c+=5;
        }
        System.out.println();
    }
 */   


    //14th pattern

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
    }

    // 15th pattern

/* for(i='F'; i>='A'; i--)
    {
        for(l='F'; l>=i; l--)
        {
            System.out.print(" ") ;
        }
        for(j='A';j<=i; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
*/

    //16th pattern

/*   for(i='A'; i<='F'; i++)
    {
        for(l='F'; l>=i; l--)
        {
            System.out.print(" ") ;
        }
        for(j='A';j<=i; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
    for(i='E'; i>='A'; i--)
    {
        for( l='E'; l>=i; l--)
        {
            System.out.print(" ") ;
        }
        for(j='A';j<=i; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
*/ 
    //17th pattern

/*  for( i='A'; i<='F'; i++)
    {
        for( l='A'; l<=i; l++)
        {
            System.out.print(" ") ;
        }
        for( j=i; j<='F'; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    for( i='F'; i>='A'; i--)
    {
        for(l='A'; l<=i; l++)
        {
            System.out.print(" ") ;
        }
        for(j=i; j<='F'; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/   
     //18th pattern

/*    for(i='A'; i<='F'; i++)
    {
        for(j=i; j<='F'; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
    for(i='F'; i>='A'; i--)
    {
        for(j=i; j<='F'; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
*/
   //19th pattern

/*    for(i='F'; i>='A'; i--)
    {
        for( l='A'; l<=i; l++)
        {
            System.out.print(" ");
        }
        for(j=i; j<='F'; j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
    }
*/
    //22th pattern

 /*for( i='A'; i<='F'; i++)
    {
        for( l=i; l<='F'; l++)
        {
            System.out.print(l+" ");
        }
        for(j='F'-1; j>=i; j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
*/

  //23rd pattern
  
/* for(i='A'; i<='F'; i++)
   {
      for(l='F'; l>=i; l--)
      {
          System.out.print(" ");
      }
      for(j='A'; j<=i; j++)
      {
          System.out.print(" "+i);
      }
      System.out.println();
    }
*/
   //24th paattern

/*  String s="JAVA";
   for(int x=1; x<=s.length(); x++)
   {
       for(int y=s.length(); y>=x; y--)
       {
           System.out.print(" ");
       }
       for(int z=1; z<=(2*x-1); z++)
       {
           System.out.print(s.charAt(x-1));
       }
       System.out.println();
   }
   */
    //25th pattern
 /*   int letter=65;
    for(int x=0; x<=4; x++)
    {
        if(x%2==0)
        {
            for(int y=0; y>=x; y--)
            {
                System.out.print((char)(letter+x));
            }
        }
            else
            {
              System.out.print((char)(letter));
            }
        System.out.println();
    }
    */

    //27th pattern

/*  int letter = 65;
    for(int x=0; x<=5;x++)
    {
        for(int y=0; y<=5; y++)
        {
            System.out.print((char)(letter+x+y));
        }
        System.out.println();
    }
*/
     //28th pattern

 /*   int letter=65;
    for(int x=0; x<=4; x++)
    {
        for(int y=0; y<=4-x; y++)
        {
            System.out.print((char)(letter+y));
        }
        for(int z=5-x-2; z>=0;z--)
        {
            System.out.print((char)(letter+z));
        }

        System.out.println();
    }
*/
    //31 pattern

 /*   char c='J';
    for(int x=0; x<=3; x++)
    {
        for(int y=0; y<=x; y++)
        {
            System.out.print(c);
            c--;
        }
        System.out.println();
    }
*/

    

  //33th pattern

 /* for(i='A'; i<='E'; i++)
    {
        char c=i;
        for(j=i; j>='A'; j--)
        {
            System.out.print(c);
            c+=4;
        }
        System.out.println();
    }
 */


   //34th pattern
   


    //34th pattern

    








  




}
}


