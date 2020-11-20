public class NaturalNmubers
{
    public static void main(String[] args) 
    {
      int num=20,sum=0;
      //by using for loop
      for(int i=1;i<=num;++i)
      {
        sum+=i;
      }
         System.out.println("sum of natural numbers of "+num+" is:"+sum);
      //by using while loop
      int i=1,sum1=0,num1=20;
      while(i<=num1)
      {
          sum1+=i;
          ++i;
      }
      System.out.println("sum of natural numbers of "+num1+" is:"+sum1); 

    }
}
