public class HalfPyrmidAlphabets {
   /* public static void main(String args[]){
        int i,j;
        for(i = 65; i<= 68; i++) {
            for(j = 65; j<= i; j++){
               System.out.print( +" ");
            }
            System.out.print("\n");
         }*/
  
         public static void main(String[] args) {
            char last = 'E', alphabet = 'A';
    
            for(int i = 1; i <= (last-'A'+1); ++i) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print(alphabet + " ");
                }
                ++alphabet;
    
                System.out.println();
            }
        }
    
     
 
    
}
