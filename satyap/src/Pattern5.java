public class Pattern5 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
        for(int m=1;m<=6;m++){
            for(int n=m;n>=1;n--){
                System.out.print((char)(n+64));
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    
}
