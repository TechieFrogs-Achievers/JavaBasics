public class Pattren1 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=6;i++)
       {
           int ch=65;
           for(int j=1;j<=i;j++)
           {
               System.out.print(((char)ch)+" ");
               ch++;
           }
           System.out.println();
 
       }
    }
}
