public class SandGalssTriangle {
    public static void main(String[] args) {
        for(int i=11;i>=1;i--){
            for(int j=1;j<=11-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=i-1;k++){
                System.out.print("* ");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        //}
        int p=0;
        for(int m=1;m<=10;m++,p=0){
            for(int n=1;n<=10-m;n++){
                System.out.print(" ");

            }
            for( p=1;p<m-1;p++)
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
                        
}
