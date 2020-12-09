package Strings;

import java.util.Scanner;
//program to calculate no of charecters ina string
public class NoOfCharecters {
    public static void main(String[] jn){
       // Scanner s=new Scanner("i am going to college");
       Scanner s=new Scanner(System.in);
       String A=s.nextLine();
       int count=0;
        for(int i=0; i<=A.length()-1;i++){
             count++;

        }
        System.out.println(count);
    }
    
}
