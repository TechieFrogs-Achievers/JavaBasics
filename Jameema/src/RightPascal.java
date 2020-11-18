public class RightPascal
 { 
     public static void main(String[] args)
      {
          int n=7;
          for(int i=0;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*" + " ");
           }
           System.out.println(" ");
        }   

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
               System.out.println(" ");
        }   
         
     }
    
}
