public class IfElseIf
{
    public static void main(String[] args)
    {
      int number=1234;
      
      if(number<100 && number>=1) //1
      {
          System.out.println(" it is a two digit number");
      } 
      else if(number<1000 && number>=100) 
      {
          System.out.println(" it is a three digit number");
      }
      else if(number<10000 && number>=1000) 
      {
          System.out.println(" it is a four digit number");
      }
     else if(number<100000 && number>=10000) 
      {
          System.out.println(" it is a five digit dogit number");
      }
    }
}