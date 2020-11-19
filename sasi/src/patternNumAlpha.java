public class patternNumAlpha
 {
    public static void main(String[] args)
     {
        int c=97,n=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j>=i;j--)
            {
                System.out.print(i);
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)c);
            }
            c++;
            System.out.println();
        }
    }
}
