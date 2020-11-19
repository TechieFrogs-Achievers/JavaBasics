public class Pattern3 
{
    public static void main(String[] args)
     {
         int n=10,j;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
            {
                System.out.print("*");
            } 
            else 
            {
                System.out.print("0");
            }           
        }
        j--;
        System.out.print("*");
        while(j>=1)
        {
            if(i==j)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print("0");
            }
            j--;
        }
        System.out.println();
    }
    }
}
