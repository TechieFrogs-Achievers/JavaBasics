public class Gcd{
     public static void main(String[] k){
         int n=6,c=0;
         int i=1;
         for(i=1;i<n;i++){
         if(n%i==0 && i%i==0){
            int hcf=i;
            if(hcf%n==0){
             c++;}
         }
        }
                 System.out.println(c);
     }
}