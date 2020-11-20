public class FullPyramid
 {
 public static void main(String[] args)
  {
    

    for(int i=1;i<=6;i++)
    {
       System.out.println();
        for(int j=1;j<=(6-i);j++)
        {
            System.out.print("  ");

        }
        for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("* ");
        }
    }  


    }
}
