public class Document
 {
     char m=70;
     char i,j;
     public void Pattern1()
     {
         System.out.println("Pattern1");
         for(i=65;i<=m;i++)
         {
            for(j=65;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
         }
         
     }
     

     public void Pattern2()
     {
         System.out.println("\n Pattern 2");
         for(i=65;i<=m;i++)
         {
             for(j=65;j<=i;j++)
             {
                 System.out.print(i+" ");
             }
             System.out.println();

         }
     }
     public void Pattern3()
     {
         System.out.println("\n Pattern 3");
         for ( i=65;i<=m;i++)
         {
             for(j=65;j<=i;j++)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
         for(i=m;i>=65;i--)
         {
             for(j=65;j<=i;j++)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
     }
     public void Pattern4()
     {
         System.out.println("\n Pattern 4");
         for(i=m;i>=65;i--)
         {
             for(j=65;j<=i;j++)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }  
         for(i=65;i<=m;i++)
         {
             for(j=65;j<=i;j++)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }       
     }
      public void Pattern5()
     {
         System.out.println("\n Pattern5");
         for(i=m;i>=65;i--)
         {
             for(j=i;j>=65;j--)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
         for(i=65;i<=m;i++)
         {
             for(j=i;j>=65;j--)
             {
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
     }
     public static void main(String[] args) 
     {
         Document d = new Document();
         d.Pattern1();
         d.Pattern2();
         d.Pattern3();
         d.Pattern4();
         d.Pattern5();
         
     }


    
}
