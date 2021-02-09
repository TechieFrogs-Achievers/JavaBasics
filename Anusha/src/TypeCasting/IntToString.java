package TypeCasting;

public class IntToString 
{
    public static void main(String[] args) 
    {
        int i=200;
        String s=String.valueOf(i);//convert int to string
        System.out.println(i+100);//300
        System.out.println(s+100);//200100
        String s1=Integer.toString(i);//convert int to string
        System.out.println(i+100);//300
        System.out.println(s1+100);//200100
        String s3=String.format("%d", i);
        System.out.println(s3);//200
        long l=121235L;
        String str=Long.toString(l);
        System.out.println(str);
        String s4="anu";
        Long l1=Long.parseLong(s4);
        System.out.println(l1);//error
    }
}
