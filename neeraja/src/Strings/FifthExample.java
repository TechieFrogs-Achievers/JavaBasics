package Strings;

public class FifthExample {
    public static void main(String[] args) {

        String s1="neeraja";
        String s2="neerajabejawada";
        String s3=s1+"bejawada";
        String s4="neeraja";
        String s7="neeraja"+"bejawada";
        String s8="neeraja"+"bejawada";

        String s5=new String("neerajabejawada");
        String s6=new String("NEERAJABEJAWADA");

        System.out.println(s2==s1);//false(contains two objects in constant pool with different reference)
        System.out.println(s2==s3);//false(concatenating by using string type variable)
        System.out.println(s1==s4);//true(contains same reference)
        System.out.println(s3==s5);//false(address is different)
        System.out.println(s6==s5);//false(address is different)

        System.out.println(s2.equals(s3));//true(checks the content present in both strings)
        System.out.println(s1.equals(s4));//true((checks the content present in both strings)
        System.out.println(s3.equals(s5));//true(contains same content)
        System.out.println(s6.equals(s5));//false(doesnot allow case sensitivity)
        System.out.println(s7.equals(s8));//true


    }
}

