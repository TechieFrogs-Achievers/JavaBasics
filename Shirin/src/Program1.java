public class Program1 
{
    
    public static void main(String[] args)
    { 
        int i,j;
    
        for( i = 1; i <= 5; i++)
        {
            for ( j = 5; j >= 1; j--)
            {
                if (j!=i)
                {
                    System.out.print(j);
                }
                else 
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



        System.out.println(".......program 3.........");

        System.out.println( );

        for ( i= 1; i <=5; i++ )
        {
            for ( j=1 ;j<=5; j++)
            {
                if (i==j)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("0");
                }

            }
             j--;
            System.out.print("*");
            while (j>=1)
            {
                if (i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");

                }
                j--;
            }
            System.out.println("");
        }

        System.out.println("---------program 4-------");
        System.out.println("");

        for ( i = 1; i <= 10; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }

       System.out.println("--------program 7");
        System.out.println();
          int s =0;
           int n=5;
        for ( i =0; i < n; i++)
        {
            for (j =1; j <= s; i++)
            {
                System.out.print(" ");
            }
            for (j=1; j <=n; j++)
            {
                if ( (j<= n-i))
                System.out.print(j);
                else
                System.out.print("*");
            }
            j--;
            while(j>0)
            {
                if (j>n-i)
                System.out.print("*");
                else
                System.out.print(j);
                j--;
            } 
            if ((n-i)>9)
            s= s + 1;
            System.out.println("");

        }

        System.out.println(" ----- program 8 -----");
        System.out.println();
        int count ;
        
         for ( i =1; i <= 5; i++)
         {
             count =0;
             for ( j =1; j < 5; j++)
             {
                 if (count<i-1)
                 {
                     if ( count<i-1)
                     {
                    
                         if (!(j< 5-i+1))
                         {
                             System.out.print(j);
                             count ++;
                         }
                     }
                 }
             }
             System.out.print("0");
             count = 0;
             for ( --j ; j>=1; j--)
             {
                 if (count<i-1)
                 {
                     System.out.print(j);
                     count++;
                 }
             }
             System.out.println("");
         }

        System.out.println("----------program 9--------");
        System.out.println();
        int num=10;
        for(i = 1; i <= num; i++)
        {
            for (j = 1; j <= num; j++)
            {
                if (((j==1)||(j==num)) || ((i==1)||(i==num)))
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


       System.out.println("-------program 10------");
        System.out.println();

        
        int r =6;
        int sum=r , p=1;
        for ( i=0; i<r; i++ )
        {
            for ( j=1; j<sum; j++)
            {
                System.out.print(" ");

            }
            p=1;
            for( int k=0; k<=i; k++)
            {
                System.out.print(p + " ");
                p= p*(i-k)/(k+1);
            }
            sum --;
            System.out.println();
        }
    

        System.out.println("---------program 15---------");
        System.out.println();
        int nm = 6 ;
        int l = 1, rw = 1, d = 2;
        for ( i =0 ; i < nm; i++)
        {
            System.out.println(l++);
            for ( j=0; j<2*i; j++)
            System.out.print(" ");
            if (i!= 0 && j!= n-1)
            System.out.print(d++);
            else 
                System.out.print(" ");
            for ( j=0; j<2*(n-i-1);j++ )
             System.out.print(" ");

             System.out.print(rw++);
             System.out.println();
            
            
        }
 


        System.out.println("------------program 16--------");
        System.out.println();

        String  str = "ISTS";
        char a[] =str. toCharArray();
        for( i=0; i<=a.length-1; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print(a[j]);
            }
            System.out.println();

        }


       
    }
    
}
