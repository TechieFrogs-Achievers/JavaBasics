public class Document2
 {
        char m=70;
         char i ,j;
         
          public void Pattern7()
          {
              System.out.println("\n Pattern7");
              for(i=65;i<=m;i++)
              {
                  for(j=m;j>=i;j--)
                  {
                      System.out.print(j+ " ");
                  }
                  System.out.println();
              }
          }
          public void Pattern8()
          {
              System.out.println("\n Pattern 8:");
              for(i=m;i>=65;i--)
              {
                  for(j=m;j>=i;j--)
                  {
                      System.out.print(j+ " ");

                  }
                  System.out.println();
              }
          }
          public void Pattern9()
          {
              System.out.println("\n Pattern9");
              for(i=m;i>=65;i--)
              {
                  for(j=65;j<=i;j++)
                 {
                    System.out.print(j+" ");
                 }
                 System.out.println();
              }
              
          }
         
          public void Pattern11()
          {
              System.out.println("\n Pattern 11");
              for(i=m;i>=65;i--)
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
            Document2 d = new Document2();
            d.Pattern7();
            d.Pattern8();
            d.Pattern9();
            d.Pattern11();
           }
              
              
    
}
