public class Pattern2_9 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((j==1||j==n)||(i==1||i==n)){
                    System.out.print("1");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}
        
