public class GcdWhile {
    public static void main(String[] args) {
        int n1=81,n2=153;
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
            System.out.println(n2);
        }
    }
    
}
