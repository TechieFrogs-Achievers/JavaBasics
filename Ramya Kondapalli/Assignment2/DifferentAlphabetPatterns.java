public class DifferentAlphabetPatterns {
    public static void main(String[] args) {
        //pattern 1
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
             //for printing characters use ASCII codes
            for (int j=65;j<=i;j++) 
            {
                //then use format specifier to print character of ASCII number
                System.out.printf("%c ",j);  
            }
        }*/
        //Pattern 2
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for(int j=65;j<=i;j++)
            {
                System.out.printf("%c ",i);
            }
        }*/
        //pattern 3
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
            {
                System.out.printf("%c ",j);
            }
        }
        for (int i=69;i>=65;i--)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //pattern 4
        /*for (int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
            {
                System.out.printf("%c ",j);
            }
        }
        for (int i=65;i<=70;i++)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //Pattern 5
        /*for (int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=i;j>=65;j--)
            {
                System.out.printf("%c ",j);
            }
        }
        for (int i=65;i<=70;i++)
        {
            System.out.println();
            for (int j=i;j>=65;j--)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //pattern 6
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for(int j=70;j>=i;j--)
            {
                System.out.print("  ");
            }
            for (int k=65;k<=i;k++)
            {
                System.out.printf(" %c ",k);
            }
        }*/
        //Pattern 7
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for (int j=70;j>=i;j--)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //Pattern 8
        /*for (int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=70;j>=i;j--)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //Pattern 9
        /*for (int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //pattern 10
        /*char str = 'A';
        for (int i=0;i<=5;i++)
        {
            System.out.println();
            for (int j=0;j<=i;j++)
            {
                System.out.print(str + " ");
                str++;
            }
        }*/
        //pattern 11
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for (int j=i;j>=65;j--)
            {
                System.out.printf("%c ",j);
            }
        }*/
        //pattern 12
        /*for (int i=0;i<=5;i++)
        {
            System.out.println();
            int temp =i;
            for (int j=0;j<=i;j++)
            {
                System.out.print(((char)(65+temp))+ " ");
                temp = temp+5;
            }
        }*/
        //Pattern 15
        /*for (int i=70;i>=65;i--)
        {
            System.out.println();
            for(int j=69;j>=i-1;j--)
            {
                System.out.print(" ");
            }
            for (int k=65;k<=i;k++)
            {
                System.out.printf("%c ",k);
            }
        }*/
        //pattern 16
         /*for (int i=65;i<=70;i++)
         {
            System.out.println();
            for (int j=70;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=65;k<=i;k++)
            {
                System.out.printf("%c ",k);
            }
         }
         for (int i=70;i>=65;i--)
         {
            System.out.println();
            for (int j=70;j>=i-1;j--)
            {
                System.out.print(" ");
            }
            for(int k=65;k<=i-1;k++)
            {
                System.out.printf("%c ",k);
            }
         }*/
         //pattern 17
        /*for (int i=65;i<=70;i++)
        {
            System.out.println();
            for(int j=i;j>=65;j--)
            {
                System.out.print(" ");
            }
            for (int k=i;k<=70;k++)
            {
                System.out.printf("%c",k);
            }
        }
        for(int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=i;j>=65;j--)
            {
               System.out.print(" ");
            }
            for (int k=i;k<=70;k++)
            {
                System.out.printf("%c",k);
            }
        }*/
        //pattern 18
        for (int i=70;i>=65;i--)
        {
            System.out.println();
            for (int j=70;j>=i-1;j--)
            {
                System.out.print(" ");
            }
            for (int k=65;k<=i;k++)
            {
                System.out.printf("%c ",k);
            }
        }
    }
}
