public class Document7
 {
     int i,j,n=5;
     public void Pattern31()
     {
         System.out.println("\n Pattern 31");
        int temp = (n * (n - 1)) / 2;
        for (i = 1; i < n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print((char) (65+ temp - 1) + " ");
                temp--;
            }
            System.out.println();
        }
     }
     public void Pattern32()
     {
         System.out.println("\n Pattern 32");
        int temp = (n * (n - 1)) / 2;
        for (i = 1; i < n; i++)
        {
            temp = temp - i;
            for (j = 1; j <= i; j++)
            {
                System.out.print((char) (65+ temp + j - 1) + " ");
            }
            System.out.println();
        }

     }
     public void Pattern33()
     {
         System.out.println("\n Pattern33");
        int k = 1;
        for (i = 1; i <=n; i++)
        {
            k = i;
            for (j = 1; j <= i; j++)
            {
                System.out.print((char) (65+ k - 1) + " ");
                k = k +n- j;
            }
            System.out.println();
        }
     }
     public void Pattern34()
     {
         System.out.println("\n Pattern34");
        int temp = 1;
        for (i = 1; i <= n/ 2 + 1; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print((char) (65+ (temp * j) - 1) + " ");
            }
            System.out.println();
            temp++;
        }
        for (i = 1; i <=n / 2; i++)
        {
            for (j = 1; j <= n / 2 + 1 - i; j++)
            {
                System.out.print((char) (65 + (temp * j) - 1) + " ");

            }
            System.out.println();
            temp++;
        }
     }
     public void Pattern35()
     {
         System.out.println("\n Pattern35");
         for (i = 0; i <n ; i++)
        {
            for (j = 0; j <= i; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (65+ j * n- (j - 1) * j / 2 + i - j) + " ");
                else
                    System.out.print((char) (65+ j * n- (j - 1) * j / 2 + n - 1 - i) + " ");
            }
            System.out.println();
        }
     }
     public void Pattern36()
     {
         System.out.println("\n Pattern36");
         for ( i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (65 + (n * (j)) + i) + " ");
                else
                    System.out.print((char) (65 + (n * (j + 1)) - i - 1) + " ");
            }
            System.out.print("\n");
        }
     }
     public void Pattern37()
     {
         System.out.println("\n Pattern37");
         int temp = 0;
        for (i = n; i >= 1; i--)
        {
            for (j = n; j >= i; j--)
            {
                System.out.print((char) (65 + j - 1) + " ");
                temp = j;
            }
            for (int k = n - i + 1; k < n; k++)
            {
                System.out.print((char) (65+ temp - 1) + " ");
            }
            System.out.println();
        }
     }
     public static void main(String[] args)
      {
          Document7 d= new Document7();
          d.Pattern31();
          d.Pattern32();
          d.Pattern33();
          d.Pattern34();
          d.Pattern35();
          d.Pattern36();
          d.Pattern37();
         
     }
    
}

    

