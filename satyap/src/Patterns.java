public class Patterns {
    //Pattern Program1 
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

    // Pattern Program for numbers(2)
        for(int k=1;k<=5;k++) {
            for(int l=1;l<=k;l++){
                System.out.print(l);
            }
            System.out.println();
        }   
        System.out.println();

    // Pattern program for alphabet(3)
        for(int p=0;p<=5;p++){
            for(int q=0;q<=p;q++){
                System.out.print(" "+(char)(65+p));

            }
            System.out.println();
        }    
        System.out.println();

    // Pattern Program for  numbers in reverse order(5)
        for(int m=1;m<=5;m++){
            for(int n=1;n<=5-m+1;n++){
                System.out.print(n);
            }
            System.out.println();

        } 
    }
    
}
