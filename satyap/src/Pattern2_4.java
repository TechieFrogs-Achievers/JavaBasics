public class Pattern2_4 {
    public static void main(String[] args) {
        int lines=10,i=1,j;
        for( i=1;i<=lines;i++){
            for( j=1;j<=i;j++){
                System.out.print(i * j+" ");
            }
            System.out.println();
        }
    }
    
    
}
