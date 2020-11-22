public class ElseIfLadder1
 {
     public static void main(String[] args)
      {
          int age = 18;
          if(age<12) // condition is true
          {
              System.out.println("those are children");
          }
          else if(age>13 && age<=19) //first condition is false and present condition is true
          {
              System.err.println("those are teenagers");
          }
          else if(age>20 && age <25) //first and second condition is false and present condition is true
          {
              System.out.println("those are youth");
          }
          else if(age>26 && age<45) //first and second condition is false and present condition is true
          {
              System.out.println("those are adults");
          }
          else //all conditions false
          {
              System.out.println("those are senior citizens");
          }
         
     }
    
}
