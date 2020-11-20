public class DiamondShape
{


  public static void main(String[] args)
   {
    for(int i=1;i<=8;i++)
    {
       System.out.println();
        for(int j=1;j<=(8-i);j++)
        {
            System.out.print("  ");

        }
        for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("* ");
        }
    }
        for(int x=0;x<=7;x++)
       {
           System.out.println();
           for(int j=0;j<=x;j++)
           {
               System.out.print("  ");
           }
           for(int k=11;k>=2*x-1;k--)
           {
               System.out.print("* ");
           }
       } 
    }
}
   

