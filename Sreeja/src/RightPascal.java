public class RightPascal
 {
 public static void main(String[] args)
  {
    for(int i=1;i<=8;i++)     //for loop of i 
    {
        for(int j=1;j<=i;j++) //for loop of j
        {
        System.out.print("* ");
        }
      System.out.println(""); 
    }
    for(int i=1;i<=7;i++)
       {
           for(int j=7;j>=i;j--)
           {
               System.out.print("* ");
           }
           System.out.println();
       } 



    }
}
