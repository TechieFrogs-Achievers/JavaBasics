package Strings;

public class StringToStringBuffer
{
    public static void main(String[] args) {
    
    String str = "Durga" ;//string without object creation
    StringBuffer sb = new StringBuffer("Baddela");//bufferclass with object
    sb.append(str);//append method to append the another string
    System.out.println(sb);
     String s1 = str;

       String s = (sb.reverse().toString());//to reverse the string
       System.out.println(s);
       if(s1.equals(s))//checks the equal condition
       {
           System.out.println("yes");
       }
       else{

       System.out.println("no");
       }
       
       
    }
}
