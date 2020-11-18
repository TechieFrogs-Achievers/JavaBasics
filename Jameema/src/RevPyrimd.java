public class RevPyrimd 
{
    public static void main(String[] args)
     {
        int n=5;
        char m=70;

        //revpyrmid using *
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
               System.out.println(" ");
        }   

        
        //rev pyrmid using num
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
               System.out.println(" ");
        }   
        

        //rev pyrmid using alphabit
        for(char a=m;a>=65;a--)
        {
           for(char b=65;b<=a;b++)
           {
               System.out.print(b);
           }
           System.out.println(" ");
        }   
        
    }
}
