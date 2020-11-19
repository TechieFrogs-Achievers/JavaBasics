public class Rightpyramid {
    public static void main(String[] args) 
    {
        int p =7;
        for(int i=0;i<=p;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            
          System.out.println(" ");
        }
    for(int i=p-1;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
  }

}
