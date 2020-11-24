public class Amstrong 
{
    public static void main(String[] args)
     {
         int num=370;
         int sum=0 , temp , rem;
         temp=num; //assiging value to the temprorary variable
         while(num>0)
         {
             rem = num%10; //gives the remainder
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
