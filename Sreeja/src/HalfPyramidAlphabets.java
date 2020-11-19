public class HalfPyramidAlphabets
 {
     public static void main(String[] args)
      {
        char ch = 'A';
        int char1 = (int)ch;

        

        for( char1=65;char1<=69;char1++)
        {
            for(int j=65;j<=char1;j++)
            {
                System.out.print((char)char1);
            
            }
            System.out.println("");
        }
    }
}
