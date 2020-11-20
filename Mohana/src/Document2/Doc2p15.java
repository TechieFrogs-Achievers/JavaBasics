package Document2;

public class Doc2p15 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=6; i++)
         {
             for(int j=1; j<=6; j++)
             {
                 if( j==1 || j==6)
                 {
                     System.out.print(i);
                 }
                 else if(i==j)
                 {
                    System.out.print(j);
                 }
                 else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        
    }
    
}
