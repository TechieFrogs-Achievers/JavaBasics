public class GcdLcm
 {
     public static void main(String[] args)
     { 
         int a=5 , b=25 , gcd=1 , lcm;

         //gcd of two numbers
         for(int i=1; i<=a && i<=b;i++ )
         {
             if(a%i==0&&b%i==0)
             {
                 gcd=i;

             }

         }
         System.out.println("the gcd of two numbers is :" +gcd);

         //lcm of two numbers
         
         lcm=(a*b)/gcd;
         System.out.println("the lcm of two numbers is :"+lcm);
     }
    
}
