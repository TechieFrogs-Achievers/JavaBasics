public class Palindrome
{
 public static void main(String[] args) 
 {
     int n=121, reversed_interger=0,remainder, original_interger;
     original_interger=n;
     //reversed interger is stored in variable
     while(n!=0)
     {
        remainder=n%10;
        reversed_interger=reversed_interger*10+remainder;
        n/=10;
     }
     //palindrome of orinal interger and revers integer are equal
     if(original_interger==reversed_interger)
         System.out.println(original_interger+" is a palindrome.");
    else
        System.out.println(original_interger+" is not a palindrome.");
 }    
}
