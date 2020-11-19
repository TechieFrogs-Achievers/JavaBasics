public class Primenumber {
    public static void main(String[] args) {
        int val = 51;
         boolean flag = false;
         for(int i =1;i<=val/2;i++)
         {
             if(val%i==0)
             {
                 flag = true;
                 break;
             }
         }
             if(!flag)
             {
             System.out.println(val+ "Prime number");
             }
             else
             {
                System.out.println(val+ " is not a prime number");
             }
         }

    }
    

