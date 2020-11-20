public class PascalTriangle {
    public static void main(String[] args) {
        int coef=1;
        for(int i=0;i<=6;i++){
            for(int j=1;j<6-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0||i==0){
                    coef=1;
                }
                else{
                coef=coef*(i-k+1)/k;
                System.out.printf("%d",coef);
                }
            }
            System.out.println();
           
        }
        
    }
    
}
