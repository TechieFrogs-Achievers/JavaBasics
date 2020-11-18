public class ElseIfLadder
 {
     public static void main(String[] args)
      {
          int age = 18;
          if(age<12)
          {
              System.out.println("those are children");
          }
          else if(age>13 && age<=19)
          {
              System.err.println("those are teenagers");
          }
          else if(age>20 && age <25)
          {
              System.out.println("those are youth");
          }
          else if(age>26 && age<45) 
          {
              System.out.println("those are adults");
          }
          else 
          {
              System.out.println("those are senior citizens");
          }
         
     }
    
}
