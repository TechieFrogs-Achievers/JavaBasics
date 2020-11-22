public class PatternUpto100 {
    public static void main(String[] args) {
        //loops for printing numbers from 0 to 100
        for(int i=1;i<=10;i++)
        {
            System.out.println();
            for (int j=1;j<=i;j++)
            {
               System.out.print(i*j + " ");
            }

        }
    }
}
