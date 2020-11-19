public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i+1;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    
}
