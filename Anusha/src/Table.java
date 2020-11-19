public class Table
{
    //main method
    public static void main(String[] args) 
    {
      int num=9;
      System.out.println(("by using for loop"));
      for(int i=1;i<=12;++i)
      {
          System.out.printf(" %d * %d= %d\n",num,i,(i*num));
      }
      System.out.println(("by using while loop"));
      int i=1, num1=5;
      while(i<=12)
      {
         ++i;
        System.out.printf(" %d * %d = %d\n",num1,i,(i*num1));
      }
      
    }
}
