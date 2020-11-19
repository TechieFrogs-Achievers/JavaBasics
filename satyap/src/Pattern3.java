public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<7;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));

            }
            System.out.println();
        }
        for(int m=1;m<=5;m++){
            for(int n=1;n<=5-m+1;n++){ 
                System.out.print((char)(64+n));
            }
            System.out.println();
        }  
    }
    
}
