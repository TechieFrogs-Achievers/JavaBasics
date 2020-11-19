public class PatternN {
    public static void main(String[] args) {
        int left=1,right=1,diagonal=2;
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.print(left++);
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
                if(i!=0 && j!=n-1)
                System.out.print(diagonal++);
                else
                System.out.print(" ");
                for( j=0;j<2*(n-i-1);j++){
                   System.out.print(" ");
                }
              System.out.print(right++);
                
            
            System.out.println();
            }
            
        }
    }
    
}
