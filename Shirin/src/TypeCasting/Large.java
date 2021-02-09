package TypeCasting;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int large =0;
        System.out.println(c);
        if(c > large)
        {
            System.out.println("its large");
        }
        else
        {
            System.out.println("0");
        }
        sc.close();
        
    }
    
}
