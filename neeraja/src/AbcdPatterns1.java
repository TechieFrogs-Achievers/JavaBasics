public class AbcdPatterns1
 {
     public static void main(String[] hb)
     {
    
    
    
     /*   //(21) 
    
    for( char i='A'; i<='F'; i++)
    {
        for( char j='F'; j>=i; j--)
        {
         System.out.print("A");
        }
    
        for(char k=i; k<=i ; k++)
        {
         System.out.print(k);
         k--;
         }
         System.out.println();
     }    */

      
   /*  //(22)
     char i,j,k;
     for( i='A'; i<='F'; i++)
    {
        for( k=i; k<='F' ; k++)
        {
            System.out.print(k);
        }
        for( j='E'; j>=i; j--)
        {
            System.out.print(j);
            
        }
        System.out.println();
    }   */



    /* //(23)
     char i,j,k;
     for(i='A'; i<='F'; i++)
     {
         for(k='F'; k>=i; k--)
         {
             System.out.print(" ");
         }
         for(j='A'; j<=i; j++)
         {
             System.out.print(" "+i);
         }
         System.out.println();
    }    */

      
    

   /* //(24)
    String str="JAVA";
    for(int i=0; i<=str.length(); i++)
    {
        for(int j=str.length(); j>=i; j--)
        {
          System.out.print(" ");
        }
        for(int z=1; z<=(2*i-1); z++)
        {
          System.out.print(str.charAt(i-1));
        }
        System.out.println();
    }*/



    //(25)

 /* //(26)
    char k=65;
    for(int x=0; x<=5; x++)
    {
        if(x%2==0)
        {
            k=((char)(k-i));
            for(int y=0; y<=x; y++)
            {
                System.out.print(k);
                k++;
            }
         }
         else
         {
             for(int z=1; z<=x;z++)
             {
                 System.out.print(k);
                k++;
             }
         }
        System.out.println();
    } */ 


   /* //(27)

   char k=65;
   for (int i = 0; i<=5; i++)
        {

            for (int j = 0; j<=5; j++)
            {
                System.out.print((char)(k+i+j));
            }
            System.out.println();
        }  */

    
    /*    // (28)
    
       char k=65;
        for (int i = 0; i<=4; i++)
        {

            for (int j = 0; j<=4-i; j++)
            {
                System.out.print((char)(k+j));
            }
            for (int z=5-i-2; z>=0; z--)
            {
                System.out.print((char)(k+z));
            }
           
            System.out.println();
        }    */

       /* //(31)
        char k='J';
        for (int i=0; i<=3; i++)
        {

            for (int j =0 ; j<=i; j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }  */


      /*  //(32)
        char k=74;
        for (int i=0; i<=3; i++)
        {

            for (int j=0 ; j<=i; j++)
            {
                System.out.print(k);
                k--;
             }
            System.out.println();
        }  */




      /*  //(33)
        char z=65;
    for(int  i=0; i<=4; i++)
    {
        int k=i;
        for(int j=i; j>=0; j--)
        {
             
                System.out.print((char) (z+k));
                k+=4;
            }
         System.out.println();
        }  */


        //(36)
        char k='A';
        for(int  i=0; i<=4; i++)
        {
            for(int j=i; j>=0; j--)
            {
                 System.out.print((char) (z+k));
                    k+=4;
                }
             System.out.println();
            }  

       
    
}  
}
