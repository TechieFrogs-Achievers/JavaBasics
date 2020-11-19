public class InvertedPyamid {
    public static void main(String[] args) {
        //int k=0;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=2*i-1;k++){
                System.out.print("* ");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
