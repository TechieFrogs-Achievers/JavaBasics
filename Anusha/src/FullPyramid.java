public class FullPyramid 
{
    public static void main(String[] args) 
    {
        int rows=6;
        for(int i=1;i<=rows;i++)
        {
          for(int space=1;space<=(rows-i);space++)
          {
              System.out.print("  ");
          }
          for(int j=1;j<=((2*i)-1);j++)
          {
              System.out.print("* ");
          }
          System.out.println();
        }    
       


    }
}
