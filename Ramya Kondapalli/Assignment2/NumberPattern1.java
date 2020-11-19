public class NumberPattern1 {
    public static void main(String[] args) {
        int num =1;
        for (int i=0;i<=5;i++)
        {
            System.out.println();
            for (int j=0;j<=5;j++)
            {
                if (i==0 || i== 5 || j==0 || j==5)
                {
                    System.out.print(num + " ");
                    num++;
                }
                else 
                    System.out.print(" ");
            }
            
        }
    }
}
