package Strings;

import java.util.Scanner;

class Conquer {

    public void divide() {
        Scanner sw=new Scanner(System.in);
        String s=sw.nextLine();
        int length=s.length();
        System.out.println("how many no of parts do you want to divide");
        int n=sw.nextInt();
        if((length%n)==0){
            //String[] a="";
            for(int i=0; i <length; i=i+(length/n)){
                System.out.print(s.substring(i, i+(length / n))+" ");
            }
           // System.out.println(a);
        }
        else{
            System.out.println("it's not possible to divide the string into equal no of charecters");
        }
    }

}

public class DividingString {
    public static void main(String[] yh){
        Conquer c=new Conquer();
   c.divide();
    }
    
}
