public class Pattern15 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(k+ 65 )+" " );
            }
            System.out.println();
        }
    }
    
}
