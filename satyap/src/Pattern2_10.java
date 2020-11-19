public class Pattern2_10 {
    public static void main(String[] args) {
        int n=6,num=1,space=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            num=1;
            for(int k=0;k<=i;k++){
                System.out.print(num+" ");
                num=num*(i-k)/(k+1);
            }
            space--;
            System.out.println();
        }
           
        
    }
    
}
