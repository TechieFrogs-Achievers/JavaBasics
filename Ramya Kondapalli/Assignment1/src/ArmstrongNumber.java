public class ArmstrongNumber {
    public static void main(String[] args) {
        
        int n=153,num=0,result=0;
        int temp = n;
        while(n>0){
            num = n % 10;
            result += (num* num* num);
            n=n/10;

        }
        if (temp == result)
            System.out.println("Armstrong number");
        else 
            System.out.println("Not a Armstrong Number");
    }
}
