public class DifferentPatterns {
    public static void main(String[] args) {
        /*o/p:--
        1aaaaa
        22bbbb
        333ccc
        4444dd
        55555e
        =====
        char c = 'a';
        for (int i=1;i<=5;i++)
        {
            System.out.println();       
            for (int j=0;j<=5;j++)      
            if (i>j)                    
            System.out.print(i);       
            else                        
            System.out.print(c);
            c++;

        }*/
        /*abcdcba
        abc cba
        ab ba
        a a
        ab ba
        abc cba
        abcdcba
        for (int i=0;i<=6;i++)
        {
            System.out.println();
            for (int k=0,j=5;j<=5;j++)
            {
                if (i==j)
                {
                    System.out.println();
                }
            }
        }*/

        String s="ISTS";
        for (int i=0;i<4;i++)
        {
            System.out.println();
            for (int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j) + " ");
            }
        }
    }
}
