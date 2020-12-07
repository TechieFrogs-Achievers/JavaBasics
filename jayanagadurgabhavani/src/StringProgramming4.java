public class StringProgramming4 
{
    public static void main(String[] args) 
    {
        String s1="jaya";
        String s2="naga";
        String s3="jaya";
        String s4="durga";
        String s5="bhavani";
        String s6=new String("jaya");
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equals(s6));//true
        System.out.println(s4.equals(s2));//false
        System.out.println(s2.equals(s2));//true
    }
}
