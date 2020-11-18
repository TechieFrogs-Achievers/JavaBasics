public class Amstrong 
{
    public static void main(String[] args)
     {
         int num=370;
         int sum=0 , temp , rem;
         temp=num;
         while(num>0)
         {
             rem = num%10;
             num=num/10;
             sum=sum+(rem*rem*rem);
             
         }
         if(temp==sum)
         {
             System.out.println(temp+ "  is amstrong number");

         }
         else
         {
             System.out.println(temp+ " is not amstrong number");
         }
        
    }
    
}
