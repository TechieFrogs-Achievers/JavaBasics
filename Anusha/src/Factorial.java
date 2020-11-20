public class Factorial 
{
    public static void main(String[] args)
    {
       int fact_num=5;
       int fact=1;
       if(fact_num<0)
       {
           System.out.println("Error! factorial of a negative number doesn't exist.");
       }
       else
       {
           for(int i=1;i<=fact_num;++i)
           {
               fact=fact_num*i;
           }
           System.out.println("Factorial of a number is:"+fact_num+"="+fact);
       }
       int fact_num1=6;
       int i=1;
       int fact1=1;
       while(i<=fact_num)
       {
          fact1=fact_num1*i;
          i++;
       }
        System.out.println("Factorial of given nnumber is:"+fact_num1+"="+fact1);
    }
    
}
