public class Palindrome {
    public static void main(String[] args) {
        
        int n= 1221,num,r=0;
        int temp = n;
        while(n>0)
        {
            num = n%10;
            r = r*10 + num;
            n=n/10;
        }
        if (r == temp)
            System.out.println("palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
