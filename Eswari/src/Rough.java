public class Rough 
{
    public static void main(String[] args) 
    {
        
        // for(int i=5;i>=1;i--)
        // {
        //     int alphabets=65;
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print((char)alphabets + " ");
        //         alphabets++;
        //     }
        //     System.out.println();
        // }
        // pattern ------18
        for(int i=1;i <= 5;i++)
        {
            int alphabets = 65;
            for(int j=1;j <= 5;j++)
            {
                if(j >= i && j <= 5)
                {
                    System.out.print( (char)(alphabets)+" " );
                }
                else
                {

                    System.out.print(" ");
                }
                alphabets++;
            }
            
            
            System.out.println();
            // System.out.print(" ");
        }

        for(int i=5;i >= 1;i--)
        {
            int alphabets = 65;
            for(int j=1;j <= 5;j++)
            {
                if(j >= i && j <= 5)
                {
                    System.out.print( (char)(alphabets)+" " );
                }
                else
                {

                    System.out.print(" ");
                }
                alphabets++;
            }
            
            
            System.out.println();
            // System.out.print(" ");
        }
    }
    
}
