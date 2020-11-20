public class DocumentA
 {
     int i,j,n=5;
     public void Pattern1()
     {
         System.out.println("\n Patternmain 1");
         for(i=1;i<=n;i++)
         {
             for(j=n;j>=1;j--)
             {
                 if(j!=i)
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

     }
     public void Pattern3()
     {
         System.out.println("\n Pattern main3");
         {
             for(i=1;i<=n;i++)
             {
                 for(j=1;j<=n;j++)
                 {
                     if(i==j)
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
                     while(j>=1)
                     {
                         if(i==j)
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
         }
     }
     public void Pattern4(int p)
     {
         System.out.println("\n Pattern main 4");
         for(i=1;i<=p;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print(i*j + " ");
             }
             System.out.println();
         }
     }
     public void Pattern7()
     {
         System.out.println("\n Pattern main 7");
        int space=0;    
        for(i=0;i<n;i++)
        { 
            for(j=1;j<=space;j++)
            {  
                System.out.print(" ");  
            }  
            for(j=1;j<=n;j++)
            {
                if(j<=(n-i))  
                System.out.print(j);  
                else  
                System.out.print("*");  
            }  
            j--;  
            while(j>0)
            {  
                if(j>n-i)  
                System.out.print("*");  
                else  
                System.out.print(j);  
                j--;  
            }  
            if((n-i)>9)
            space=space+1;  
        System.out.println("");  
        }  
        
     }
     public void Pattern8(int u)
     {
         System.out.println("\n Pattern main 8");
        int count;  
        for(i=1;i<=u;i++)
        {
            count=0;
            for(j=1;j<u;j++)
            {
              if(count<i-1)
              {  
                if(!(j<u-i+1))
                {  
                  System.out.print(j);  
                  count++;  
              }  
          }  
      }  
      System.out.print("0");  
      count=0;  
      for(--j;j>=1;j--)
      {  
          if(count<i-1)
          {  
          System.out.print(j);  
          count++;  
          }  
      }  
      System.out.println("");  
 }  

     }
     public void Pattern9(int m)
     {
         System.out.println("\n pattern main 9");
         for(i=1;i<=m;i++)
         {
             for(j=1;j<=m;j++)
             {
                 if((j==1||j==m)||(i==1||i==m))
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

     }
     public void PatternAlpha()
     {
         System.out.println("\n ISTS Pattern");
         String str="ISTS";
         char a[]=str.toCharArray();
         for(i=0;i<=a.length-1;i++)
         {
             for(j=0;j<=i;j++)
             {
                 System.out.print(a[j]);
             }
             System.out.println();
         }
     }
     public void PatternalphaNumeric()
     {
         System.out.println("\n PetternAlphanumeric");
         int c=97;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=i;j++)
             {
                System.out.print(i);
            }
            for(j=n;j>=i;j--)
            {
                System.out.print((char)c);
            }
            c++;
            System.out.println();
        }
     }
     public void PatternN(int x)
     {
        int left=1, right=1 , Diagonal=2;
        for(i=0;i<x;i++)
        {
            System.out.print(left++);
            for(j=0;j<2*i;j++)
            
                System.out.print(" ");
                if(i!=0&&j!=x-1)
                System.out.print(Diagonal++);
                else
                System.out.print(" ");
                for(j=0;j<2*(x-i-1);j++)

                 System.out.print(" ");

             System.out.println(right++);
            
            System.out.println();
        }
     }
     public void PatternPascal()
     {
         System.out.println("\n PatternPascal");
        int space=n , num=1;
        for(i=0;i<n;i++)
        {
            for(j=1;j<space;j++)
            {
                System.out.print(" ");
            }
            num=1;
            for(int k=0;k<=i;k++)
            {
               System.out.print(num + " ");
                 num = num * (i-k)/(k+1);

            }
            space--;
            System.out.println();
        }
       
     }
     public static void main(String[] args) 
     {
         DocumentA d = new DocumentA();
         d.Pattern1();
         d.Pattern3();
         d.Pattern4(10);
         d.Pattern7();
         d.Pattern8(10);
         d.Pattern9(10);
         d.PatternAlpha();
         d.PatternalphaNumeric();
         d.PatternN(6);
         d.PatternPascal();

         
     }
    
}
