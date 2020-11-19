public class Pattern26 {
    public static void main(String[] args) {
        int count=1,alphabet=65,row=1;
        for(int i=1;i<=5;i++){
            if(i%2==0){
                for(int j=1;j<=i;j++){
                    System.out.print((char)(count+alphabet-1)+" ");
                    count++;
                }
            }
            else{
                int reverse=row+count-1;
                for(int j=0;j<i;j++){
                    System.out.print((char)(reverse+alphabet-1)+" ");
                    reverse--;
                    count++;
                }
            }
            System.out.println();
                row++;
        }
    }
    
}
