public class Pattern4 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i+1;j++){
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
        for(int m=1;m<=6;m++){
            for(int n=1; n<=m;n++){
                System.out.print((char)(n+64));
            }
            System.out.println(" ");
            
        }
        System.out.println();

    }
}
