
import java.util.*;
class ArOperations
{
    //method to perform arithmetic operations
    double add(char firstDigit,char secondDigit, String operater)
    {
      float sum=0;
      double x=0;
      //metod body(logic)
      switch(operater)
      {
          //case statements
          case "+" :
          sum=firstDigit+secondDigit;
          break;
          case "-" :
          sum=firstDigit-secondDigit;
          break;
          case "*" :
          sum=firstDigit*secondDigit;
          break;
          case "/" :
          sum=firstDigit/secondDigit;
          break;
          case "%" :
          sum=firstDigit%secondDigit;
          break;
          //default case
          default:
          System.out.println("operation not matched");
          break;
          
      }
         //returning output
          return sum;
    }
    
}
// main class
public class ArithmeticOperations 
{
    public static void main(String... rf)
    {
       /* String x=rf[0];
        String y=rf[1];
        String z=rf[2]; 

        String sum="";
        //metod body(logic)
        switch(z)
        {
            //case statements
            case "+" :
            sum=(x+y);
            System.out.println(sum);
            break;
            case "-" :
            sum=(x-y);
            break;
            case "*" :
            sum=x*y;
            break;
            case "/" :
            sum=x/y;
            break;
            case "%" :
            sum=x%y;
            break;          
            //default case
            default:
            System.out.println("operation not matched");
            break;
            
        }
           ArithmeticOperations.main("4","g","+");
           
            */
         
     ArOperations a=new ArOperations();
    
     /*Scanner sc=new Scanner(System.in);
     System.out.println("enter 1st digit  :");
     float firstDigit=sc.nextFloat();
     System.out.println("enter 2nd digit  :");
     char secondDigit=sc.next().charAt(0);
     System.out.println("enter operator   :");
     String operater=sc.next();
     */
    
     double s=a.add('h','t',"*");
     System.out.println(s);
     

    
 }
}
