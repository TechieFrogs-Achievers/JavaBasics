public class FloydTriangle
 {
     public static void main(String[] args)
      {
        int k=1;
        
        for(int i=1;i<=4;i++)
        {
            System.out.println("\t");
            for(int j=1;j<=i;j++)
            {
                System.out.print(k++ );
            }
        }
    }
}
