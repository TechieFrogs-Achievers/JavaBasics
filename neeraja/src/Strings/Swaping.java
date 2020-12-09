package Strings;

public class Swaping {
    public static void main(String[] tf){
        String a="neeraja";
        String b="bejawada";
         System.out.println("before swaping value of a is: "+a);
         System.out.println("before swaping value of b is: "+b);
    
     a=a+b;
     b=a.substring(0,a.length()-b.length());//a.substring(0,7)
     a=a.substring(b.length());//a.substring(7)
     System.out.println("After swaping value of a is: "+a);
     System.out.println("After swaping value of b is: "+b);

    }
    
}
