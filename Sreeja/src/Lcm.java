public class Lcm
 {
     public static void main(String[] args) 
     {
        int x=12;
        int y=8;
         int gcd = 1;
         for(int i = 1; i < x && i <=y; i++)  
         {
          if(x%i==0 && y%i==0)  
            gcd =i;
          
         } 
         int lcm = ((x*y)/gcd);
         System.out.println(lcm);
        
    }
}
