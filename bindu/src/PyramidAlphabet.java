public class PyramidAlphabet {
    public static void main(String[] args)
     {
         char k = 'A';
         char l = 'E';
         for(k ='A'; k<='E'; k++)
         {
            for(l ='A'; l<=k; l++)
            {
                System.out.print(k +" ");
            }
            System.out.println();
        } 
    }
}
