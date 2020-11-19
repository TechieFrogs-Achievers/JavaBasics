public class Pattern20 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
        for(int j=1;j<=6-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print((char)(j+64));
        }       
        for(int j=i-1;j>=1;j--){
            System.out.print((char)(j+64));
        }
        System.out.println();
    }
    }
    
}
