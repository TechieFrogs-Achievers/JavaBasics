public class ForLoopPractice1 {
    public static void main(String args[])
    {
        for (int i=0;i<=5;i++)//outer loop
        {
            for (int j=0;j<=i;j++)//inner loop
            {
                System.out.print(j + " "); //print j value 
            }
            System.out.println();
        }
    }    
}
