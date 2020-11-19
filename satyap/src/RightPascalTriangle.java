public class RightPascalTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for(int m=1;m<=7;m++){
            for(int n=1;n<=7-m+1;n++){ 
                System.out.print("* ");
            }
            System.out.println();
        }
    
            
        
    }
}
