 class IfElse
 {
 public static void main(String args[])
 {
     int r,sum=0,temp=5;
     int n=121;
     temp=n;
      if(n>0)
      {
          r=n%10;  
          sum=(sum*10)+r;
          n=n/10;   
      } 
      if(temp==sum)  

      System.out.println("palindrome number ");
      else
       System.out.println("not palindrome");   
    }
} 