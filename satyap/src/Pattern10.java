public class Pattern10 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++,k++){
                System.out.print((char)(k+64));
            }
            System.out.println();
        
        }
    }
    
}
