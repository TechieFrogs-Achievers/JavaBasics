 public class Rough1
 {
     public static void main(String[] args) 
     {
        int n=5 ,i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            for(j=i-1;j>=0;j--)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            System.out.println();
        }
    
   
     }
}
