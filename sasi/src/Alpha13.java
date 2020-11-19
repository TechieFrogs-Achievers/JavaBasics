public class Alpha13 
{
    public static void main(String[] args)
     {
        for(int i=0;i<=6;i++)
        {
            for(int j=6;j>1;j--)
            {
                System.out.print(" ");
            }
           int num=1;
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)+('A'-1+num)+" ");
                num=num * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
