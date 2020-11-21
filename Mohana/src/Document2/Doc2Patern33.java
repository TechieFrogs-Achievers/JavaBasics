package Document2;

public class Doc2Patern33 
{
    public static void main(String[] args) 
    {
        for( char i= 65; i<=69; i++)
         {
        char c=i;
        for(char j=i; j>=65; j--)
        {
            System.out.print(c);
            c+=4;
        }
        System.out.println();
       }
        
    }  

}