package Strings;

import java.util.Scanner;

public class CovertUppercase
 {
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in); //inputclass
         String s=sc.nextLine(); 
          s=s.toUpperCase(); //string changing  into uppercase letters
          System.out.println(s);
          sc.close();
        
    }
}
