package Strings;

public class StringUsingEquals {
    public static void main(String[] args) {

        String s1 = new String("Ramya"); 
        String s2 = "Ramya";

        System.out.println(s1==s2);  //false
        //It compare objects

        System.out.println(s1.equals(s2));  //true
        //It compare content

        Boolean b= "hello" == "hello";  //true
        //direct comparison through data
        System.out.println(b);

        Boolean b1 = "Techiefrogs".equals("Ramya");   //false
        //it compares the content
        System.out.println(b1);

        System.out.println(10 == 20);   //false
        //it compares objects

        System.out.println("Ramya".equals("kondapalli"));  //false
    }
}
