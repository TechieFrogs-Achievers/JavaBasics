public class NNumberPattern
 {
    public static void main(String[] args) 
    {
        int n=6,i,j;
        int left=1,right=1,diag=2;
        for(i=0;i<n;i++)
        {
            System.out.print(left++);
            for(j=0;j<2*i;j++)

                System.out.print(" ");
                if(i!=0&&j!=n-1)
                System.out.print(diag++);
                else
                System.out.print(" ");
                for(j=0;j<2*(n-i-1);j++)
                            
                System.out.print(" ");
            System.out.print(right++);
        System.out.println();
        }
    }
}
                

    
