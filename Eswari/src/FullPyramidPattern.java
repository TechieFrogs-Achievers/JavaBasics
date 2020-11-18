public class FullPyramidPattern 
{

    public void fullPyramid(int totalNoOfRows)
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

    }
    public static void main(String args[])
    {
        FullPyramidPattern fp=new FullPyramidPattern();
        fp.fullPyramid(9);
    }
    
}
