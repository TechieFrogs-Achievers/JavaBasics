public class Gcd {
    public static void main(String[] args) {
        int a = 32, b = 126, gcd = 1;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i==0 && b % i==0)
                gcd = i;
        }
        System.out.print("G.C.D of a and b is " +a+" " +b+" " +gcd);


        //while loop 
        while(a==b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else 
            {
                b = b-a;
            }
            System.out.println("Gcd is :" +a);
        }
    }
        
    
    
}
