package Document2;

public class Doc2p11 
{
    public static void main(String[] args) 
    {
        char letter ='a';
        String symbol="(";

         for(int i=1; i<= 5; i++)
         {
             symbol=symbol+String.valueOf(letter);

             System.out.println(symbol+")");

             letter++;
             
            symbol=symbol+ "+";
         }
        
    }
    
}
