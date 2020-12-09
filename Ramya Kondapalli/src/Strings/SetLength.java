package Strings;

public class SetLength {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("ramya");//creating a string using string buffer

        System.out.println("Length of string : " + sb.length());
        System.out.println("String : " + sb);

        sb.setLength(4); //setting length equal to 4

        System.out.println("New String length : " + sb.length()); //4
        System.out.println("New String : " + sb); //ramy

        sb.setLength(7); //again lengthis set to 7

        System.out.println("New String length : " + sb.length()); //7
        System.out.println("New String : " + sb); //ramy

    }
}
