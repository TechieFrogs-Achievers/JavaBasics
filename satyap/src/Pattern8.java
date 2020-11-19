public class Pattern8 {
    public static void main(String[] args) {
        for(int m=1;m<=6;m++){
            for(int n=6;n>=6-m+1;n--){
                System.out.print((char)(n+64));
            }
            System.out.println(" ");
            
        }
    }
    
}
