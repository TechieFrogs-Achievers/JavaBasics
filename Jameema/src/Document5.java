public class Document5
 {
     int i, j,k, n=5;
     public void Pattern20()
     {
         System.out.println("\n Pattern20");
         for(i=0;i<=n;i++)
         {
             for(j=n-1;j>=i;j--)
             {
                 System.out.print(" ");
             }
             for(k=0;k<=i;k++)
             {
                 System.out.print((char)(65+k));
             }
             for(int l=i-1;l>=0;l--)
             {
                 System.out.print((char)(65+l));
             }
             System.out.println();
         }
     }
     public void Pattern21()
     {
         System.out.println("\n Pattern 21");
         for(i=0;i<=n;i++)
         {
             for(j=n-1;j>=i;j--)
             {
                 System.out.print("A" + " ");
             }
             for(k=0;k<=i;k++)
             {
                 System.out.print((char)(65+i));
             }
             System.out.println();
         }
     }
     public void Pattern22()
     {
         System.out.println("\n Pattern22");
         {
             for(i=0;i<=n;i++)
             {
                 for(j=i;j<=n-1;j++)
                 {
                     System.out.print((char)(65+j) + " ");
                 }
                 for(k=n-2;k>=i;k--)
                 {
                     System.out.print((char)(65+k) + " ");
                 }
                 System.out.println();
             }
         }
     }
     public void Pattern23()
     {
         System.out.println("\n Pattern23");
         for(i=0;i<=n-1;i++)
         {
             for(j=n-1;j>i;j--)
             {
                 System.out.print(" ");
             }
             for(k=0;k<=i;k++)
             {
                 System.out.print((char)(65+i) + " ");
             }
             System.out.println();
         }
     }
     public void Pattern24()
     {
         System.out.println("\n Pattern24");
         String input = "JAVA";

        for (int i = 1; i <= input.length(); i++) 
        { 
            for (int j = input.length(); j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k >= 1; k--)
            {
                System.out.print(input.charAt(i - 1));
            }
            System.out.println("");
        }
     }
     public void Pattern25()
     {
         System.out.println("\n Pattern25");
        int num= 1;
        int counter = 1;
        
        for (int i=1; i<= n; i++)
        {
            if (i % 2 == 0) 
            {
                int reverse = num + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print((char) (reverse + 65 -1)+" ");
                    reverse--;
                    counter++;
                }
            }
            else
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (counter + 65 - 1)  +" ");
                    counter++;
                }
            }
            System.out.println();
            num++;
        }
     }

     public static void main(String[] args)
      {
          Document5 d =new Document5();
          d.Pattern20();
          d.Pattern21();
          d.Pattern22();
          d.Pattern23();
          d.Pattern24();
          d.Pattern25();
         
     }
    
}
