public class Pattren10
{
    public static void main(String[] args) 
    {
        int rows=5,ch=65;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(((char)ch)+" ");
                ch++;
            }
            System.out.println();
        } 
    }
}
