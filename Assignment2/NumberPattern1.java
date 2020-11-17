public class NumberPattern1 {
    public static void main(String[] args) {
        int num =1;
        for (int i=0;i<=5;i++)
        {
            System.out.println();
            for (int j=1;j<=5;j++)
            {
                if(i>=j && i+j >=1)
                System.out.print(num + " ");
                else if (i == j)
                System.out.print(" ");
                else 
                System.out.println(" ");
                
            }
            num++;
        }
    }
}
