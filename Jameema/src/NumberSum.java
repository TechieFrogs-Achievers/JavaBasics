public class NumberSum 
{
    public static void main(String[] args) 
     {
        int num=100;
        int sum=0 , tot=0;
        int i=1;

        //using for loop
        for (int j=1;j<=num;j++)
         {
          sum =sum+j; 
         }
         System.out.println("Sum = " + sum);
         
         //using while loop
        while(i<=num)
        {
            tot=tot+i;
            i++;        
        }
        System.out.println("tot is  " +tot);
         
     }
    
}
