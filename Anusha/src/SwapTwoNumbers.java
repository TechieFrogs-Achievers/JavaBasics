public class SwapTwoNumbers 
{
    //main method
   public static void main(String[] args) 
   {
      int num1=12;
      int num2=57;
      System.out.println("Before swap two numbers:"+"\n"+"num1="+num1+"\n"+"num2="+num2);
      num1=num1+num2;//12+57=69
      num2=num1-num2;//69-57=12
      num1=num1-num2;//69-12=57
      System.out.println("Ater swap to numbers:"+"\n"+"num1="+num1+"\n"+"num2="+num2);
      
   } 
}
