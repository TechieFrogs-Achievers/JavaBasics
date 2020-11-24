public class NumberPattern1 {
    public static void main(String[] args) {
        int num =1;
        for (int i=0;i<=5;i++)
        {
            System.out.println();
            for (int j=0;j<=5;j++)
            {
                //print the hollow square with numbers
                if (i==0 || i== 5 || j==0 || j==5)
                {
                    System.out.print(num + " ");
                    num++;
                }
                //else space will print
                else 
                    System.out.print(" ");
            }
        }
    }
}
