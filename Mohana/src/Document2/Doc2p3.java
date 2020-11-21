package Document2;

public class Doc2p3 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=9; j++)
            {
                if(i==j||j==5||i+j==10)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    
}
