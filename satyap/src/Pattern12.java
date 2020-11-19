public class Pattern12 {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
            int diff=6-1;
            int value=i;
            for(int j=1;j<=i;j++){
                System.out.print((char)(value+64));
                value=value+diff;
                //diff--;

            }
            System.out.println();
        }
    }
    
}
