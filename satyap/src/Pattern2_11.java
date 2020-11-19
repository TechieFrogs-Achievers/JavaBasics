public class Pattern2_11 {
    public static void main(String[] args) {
        int num=97;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int j=5;j>=i;j--){
                System.out.print((char)(num));
            }
            num++;
            System.out.println();
        }
    }
    
}
