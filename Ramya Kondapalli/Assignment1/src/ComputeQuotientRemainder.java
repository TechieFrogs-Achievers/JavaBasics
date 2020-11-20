import java.util.Scanner;

public class ComputeQuotientRemainder {
    public void quotient(int x ,int y){
        int result = x/y;
        System.out.println("quotient :" + result);
    }
    public void remainder(int x,int y)
    {
        int d= x%y;
        System.out.println("remainder :" + d);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a= s.nextInt();
        int b = s.nextInt();
        ComputeQuotientRemainder obj = new ComputeQuotientRemainder();
        obj.quotient(a,b);
        obj.remainder(a,b);
        s.close();
    }
   
}
