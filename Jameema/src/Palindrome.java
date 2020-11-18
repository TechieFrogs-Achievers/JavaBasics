public class Palindrome
 {
     public static void main(String[] args)
      {    
        int n=34543; 
        int rem , revnum=0 , temp;
        temp=n;  

        while(n>0)
        {
            rem=n%10;
            revnum=(revnum*10)+rem;    
            n=n/10;    
        }   

        if(temp==revnum) 
        {
            System.out.println( temp+ "  is palindrome number ");    
        }
        else
        {
            System.out.println( temp+ "  is not palindrome");
        }
         
     }
    
}
