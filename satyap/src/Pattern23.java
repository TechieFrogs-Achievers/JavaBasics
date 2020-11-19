public class Pattern23 {
    public static void main(String[] args) {
        for(int p=0;p<=5;p++){
            for(int q=5;q>=p;q--){
                System.out.print(" ");
            }
            for(int k=0;k<=p;k++){
                System.out.print((char)(65+p)+" ");
            }

        
            System.out.println();
        }    
    }
    
}
