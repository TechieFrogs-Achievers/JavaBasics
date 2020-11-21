package Document2;

public class Doc2Pattern31 
{
    public static void main(String[] args) 
    {
        char letter='J';
        for(int i=0; i<=3; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(letter);
                letter--;
            }
            System.out.println();
        }
        
    }
    
}
