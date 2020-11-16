public class HelloWorldPattern 
{
    public static void main(String[] args)
    {
        String s1= "HELLO",s2="WORLD";
        for(int i=0;i<5;i++)
        {
            System.out.println();
            for(int j=0;j<=i;j++)
            {
                System.out.print(s1.charAt(j));   
            }
        }
            for(int k=4;k>=0;k--)
            {
                    System.out.println();
                    for(int j=0;j<=k;j++)
                {
                    System.out.print(s2.charAt(j));   
                }
            }
    }
}
