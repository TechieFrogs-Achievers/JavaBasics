package TypeCasting;

public class StringToInt 
{
    public static void main(String[] args) 
    {
        String s="100";
        int i=Integer.parseInt(s);//convering string into int using integer.parseint()
        System.out.println(i);
        int j=Integer.valueOf(s);//convering string into int using integer.valueof()
        System.out.println(j+100);
        
    }
}
