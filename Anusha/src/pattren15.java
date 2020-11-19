public class pattren15 
{
 public static void main(String[] args) 
 {
    for(int i=5;i>0;i--)
    {
        for(int j=5-i;j>=1;j--)
        {
            System.out.print(" ");
        }
        int ch=65;
        for(int k=1;k<=i;k++)
        {
            System.out.print(((char)ch)+" ");
            ch++;
        }
        System.out.println();
    }
 }   
}
