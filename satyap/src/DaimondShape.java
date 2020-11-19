public class DaimondShape {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=8;i++,k=0){
            for(int j=1;j<=8-i;j++){
                System.out.print(" ");

            }
            while(k!=2*i-1){
                System.out.print("* "+" ");
                k++;
            }
            System.out.println();
        }
        for(int m=7;m>=1;m--){
            for(int n=1;n<=5-m;n++){
                System.out.print(" ");
            }
            for(int p=m;p<=2*m-1;p++){
                System.out.print( "* "+" ");
            }
            for(int p=0;p<m-1;p++){
                System.out.print("* "+" ");
            }
            System.out.println();
        }


        
            
        
    }
    
}
