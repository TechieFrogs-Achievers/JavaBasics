import javax.lang.model.util.ElementScanner14;

public class IfElse 
{
     public static void main(String[] args) 
    {
       int a=5, b=7,c=-5;
       float radius = 2.4f,area;
       boolean user = true,z;
       char ch ='u';
       int year = 1998;
       String x = "aaa";
       String y = "aaa";
       if((a == b) && (++b == 7))//1
       {
         System.out.println(a);
         System.out.println(b);
       }
       else
       {
           System.out.println(a);
           System.out.println(b);
       }
       if((a == b) & (++b == 7))//2
       {
         System.out.println(a);
         System.out.println(b);
       }
       else
       {
           System.out.println(a);
           System.out.println(b);
       }
       if(c > 0)//3
       {
           System.out.println(" c is positive number");
       }
       else
       {
        System.out.println("c is negative number");
       }
       if(radius >= 0)//4
       {
           area = (float) (radius * 3.14);
           System.out.println("the are of circle is" + area);
       }
       else
       {
           System.out.println("negative input");
       }
       if(!user)//5
       {
           System.out.println("  its false");
       }
       else
       {
           System.out.println(" its true");
       }
       if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')//6
       {
       System.out.println(" vowel");
       }
       else
       {
           System.out.println("consonent");
       }
       if((year%4 == 0 && year%100 !=0)|| year%400 == 0)//7
       {
           System.out.println(" leap year");
       }
       else
       {
           System.out.println("not a leap year");
       }
       if( z = x == y )//8
       {
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
    }
    
}
