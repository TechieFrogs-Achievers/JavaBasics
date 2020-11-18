public class Document3 
{
      int i, j,k, n=6;
      public void Pattern6()
         {
             System.out.println("\n Pattern6");
             for(i=0;i<n;i++)
             {
                 for(j=n-1;j>=i;j--)
                 {
                     System.out.print(" ");
                 }
                 for(j=0;j<=i;j++)
                 {
                     System.out.print(((char)(j+65))+ " ");
                 }
                 System.out.println();
             }
         }
         public void Pattern10()
         {
             System.out.println("\n Pattern10");

             for(i=0;i<=n-1;i++)
            {
                for(j=0;j<=i;j++,k++)
                {
                    System.out.print(((char)(65+k)+ " "));
                }
                System.out.println();
            }
         }
         public void Pattern12()
         {
             System.out.println("/n Pattern12");
             for(i=0;i<=n-1;i++)
             {
                 int temp=i;
                 for(j=i;j>=0;j--)
                 {
                     System.out.print(((char)(65+temp))+ " ");
                     temp=temp+5;
                 }
                 System.out.println();
             }
         }
         public void Pattern15()
         {
             System.out.println("\n Pattern 15");

             for(i=n;i>=0;i--)
             {
                 for(j=n-1;j>=i-1;j--)
                 {
                     System.out.print(" ");
                 }
                 for(j=0;j<i;j++)
                 {
                     System.out.print(((char)(j+65))+ " ");
                 }
                 System.out.println();
             }
         }
         public void Pattern16()
         {
             System.out.println("\n Pattern16");
             for(i=0;i<n;i++)
             {
                 for(j=n-1;j>=i;j--)
                 {
                     System.out.print(" ");
                 }
                 for(j=0;j<=i;j++)
                 {
                     System.out.print(((char)(j+65))+ " ");
                 }
                 System.out.println();
             }
             for(i=n-1;i>=0;i--)
             {
                 for(j=n-1;j>=i-1 ;j--)
                 {
                     System.out.print(" ");
                 }
                 for(j=0;j<i;j++)
                 {
                     System.out.print(((char)(j+65))+ " ");
                 }
                 System.out.println();
             }
         }
         public static void main(String[] args)
         {
             Document3 d = new Document3();
             d.Pattern6();
             d.Pattern10();
             d.Pattern12();
             d.Pattern15();
             d.Pattern16();
         }
        
    
    
}
