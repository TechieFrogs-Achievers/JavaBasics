public class HalfPyramidAlphabets 
{
    public static void main(String[] args) 
    {
        char last ='E',alphabet='A';
        for(int i=1; i<=(last-'A'+1);++i)
        {
            for(int j = 1;j <= i; ++j)
            {
                System.out.print(alphabet+" ");
            }
            ++alphabet;
            System.out.println();    
        }
        for(int i=1;i<=5;i++)
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
