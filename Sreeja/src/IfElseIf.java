public class IfElseIf
{
  
 public static void main(String[] args) 
    {
      int number = 25; 

      if((number>0)&&(number<10))
      {
          System.out.println("the number is in the range of 0-10");
      }
      else if((number>10)&&(number<20)) 
      {
        System.out.println("the number is in the range of 10-20");
      } 
      else if((number<30)&&(number>20))
      {
        System.out.println("the number is in the range of 20-30");     
      }
      else if((number>50)&&(number<100))
      {
        System.out.println("the number is in the range of 50-100");
      }
      else
      {
      System.out.println("the number is in out of range");
      }
    
    
    
    }

}


