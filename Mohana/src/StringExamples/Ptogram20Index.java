package StringExamples;

import java.util.Scanner;

public class Ptogram20Index
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //taking input from keyboard
        String s1 = sc.nextLine();
        //index of method returns -1 if string not present 
          int value  =  s1.indexOf("m");

          System.out.println(value);

          sc.close();
        
    }
}
