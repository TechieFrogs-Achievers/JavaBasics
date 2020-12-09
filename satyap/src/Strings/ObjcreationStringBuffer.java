package Strings;

public class ObjcreationStringBuffer 
{
    public static void main(String[] args)
    {
         StringBuffer sb =new StringBuffer();
        System.out.println(sb.append("java")); 
        System.out.println(sb.append(" is"));
        System.out.println(sb.append(" Programming language"));
        sb=new StringBuffer();
        System.out.println("Updated StringBuffer:"+sb);
    }
}
