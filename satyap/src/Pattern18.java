public class Pattern18 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print((char)('A'+k)+" ");
            }        
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++){
                System.out.print((char)('A'+k)+" ");
            }
            System.out.println();
        }
        
    }

    
}
