public class ArrayProgramming5 
{
    public static void main(String[] args) 
    {
        char[] CopyFrom={'j','a','y','a','n','a','g','a'};
        char[] CopyTo=new char[5];
        System.arraycopy(CopyFrom,1,CopyTo, 0,5);
        System.out.println(String.valueOf(CopyTo));
    }
}
