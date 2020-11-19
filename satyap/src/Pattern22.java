public class Pattern22 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){
               System.out.print((char)(65+j)+" ");
            }
            for(int k=5-1;k>=i;k--){
                System.out.print((char)(65+k)+" ");
            }
            System.out.println();
        }
    }
    
}
