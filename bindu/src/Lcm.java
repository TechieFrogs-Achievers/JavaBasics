public class Lcm {
    public static void main(String[] args) {
        int m = 24;
        int n = 36;
        int lcm;
        lcm = (m>n)?m:n;
        while(true)
        {
            if(lcm % m == 0 && lcm % n == 0)
            {
                System.out.println("lcm of m and n is" +m+" " +n+" " +lcm);
                break;
            }
            lcm++;
        }

        
    }
    
}
