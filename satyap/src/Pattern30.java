public class Pattern30 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print((char)(65+j));
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print(" ");
            }
            for(int m=5-i;m>=0;m--){
                if(m!=5){
                    System.out.print((char)(65+m));
                }
                
            }
            System.out.println();
        }
        for(int i=5-1;i>=0;i--){
            for(int j=0;j<=5-i;j++){
                System.out.print((char)(65+j));
            }
            for(int k=1;k<=i*2-1;k++){
                if(k!=5){
                    System.out.println();
                }
                
            }
        }
    }
    
}
