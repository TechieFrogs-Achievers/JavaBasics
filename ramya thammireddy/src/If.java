public class If {
     
        public static void main(String args[]) 
        { 
            int i = 10; 
      
            if (i < 15) 
                System.out.println("10 is less than 15"); 
      
            // This statement will be executed 
            // as if considers one statement by default 
            System.out.println("Outside if-block"); 
        } 
    
    
    
}
//another if program
class IfDemo { 
    public static void main(String args[]) 
    { 
        String str = "If statement"; 
        int i = 4; 
  
        // if block 
        if (i == 4) 
        { 
           i++;  
            System.out.println(str); 
        } 
  
        // Executed by default 
        System.out.println("i = " + i); 
    } 
} 
 //if statment using relational operators
 class IfDemo1
 {
     public static void main(String args[])
     {
         int x=8;
         String s="hello";
         boolean z=true;
          if(x==22)
          {
              System.out.println("x is  equql to 22");
          }
          if(x!=22)
          {
              System.out.println("x is not equal to 22 ");
          }
          if(x>22)
          {
              System.out.println("x is greater than 22");
          }
          if(x>=22)
          {
              System.out.println("x is greater than or equal to 22");
          }
          if(x<=22)
          {
              System.out.println("x is lessthan or equal to 22");
          }
          if(z=true)
          {
              System.out.println("the given boolean value is true");
          }
          if("hello"==s)
          {
              System.out.println("the string name is hello");
          }

     }
 }