public class Programmingpatterns
 {
    public static void main(String[] args)
    {
        int rows=12;
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
