//example for printing diamond shape pattern
public class DiamondShapePattern 
{
    public void diamondPattern(int totalNoOfRows)
    {
        for(int rows=1; rows <= totalNoOfRows; rows++)    //loop for how many are there
        {
            for(int space=1; space <= (totalNoOfRows-rows); space++)  //loop for how many spaces are need
            {
                System.out.print(" ");
            
            }
            for(int symbol=1; symbol <= ((2 * rows)-1);symbol++)   //loop for printing how many starts we want
            {
                System.out.print("*" );
            }
            System.out.println( );
            
        }
        for(int rows=totalNoOfRows-1; rows >= 1; rows--)    //loop for how many are there
        {
            for(int space=1; space <= (totalNoOfRows-rows); space++)  //loop for how many spaces are need
            {
                System.out.print(" ");
                
            }
            for(int symbol=1; symbol <= ((2 * rows)-1);symbol++)   //loop for printing how many starts we want
            {
                System.out.print("*" );
            }
            System.out.println( );
                
        }
    }
    public static void main(String[] args) {
        DiamondShapePattern d= new DiamondShapePattern();   //object creation
        d.diamondPattern(9);   //calling method using object
    }
    
}
