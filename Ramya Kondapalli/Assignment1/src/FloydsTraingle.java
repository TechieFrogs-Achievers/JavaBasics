public class FloydsTraingle {
    public static void main(String[] args) {
      int num = 1;
        for (int i=0;i<5;i++)
        {
            System.out.println(" ");
            for (int j=0;j<=i;j++)
            {
                System.out.print(num + " ");
                num = num+1;
            }
        }
        
    }
}
