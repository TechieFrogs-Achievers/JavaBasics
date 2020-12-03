package scanner;

import java.util.Scanner;

public class Examine {
    public static void main(String[] jn){

        //i st scenario
        long n = 784567;
        char c='g';
       // Scanner scaner=new Scanner(c);
        String s="I am an employee";
        //class scanner to read input
        Scanner scanner=new Scanner(s);
        System.out.println(scanner);


        //USING  SCANNER(STRING SOURCE)
       //2nd scenario
        System.out.println ("The subjects are as follows :");
        String input = "1 Maths  2 English 3 Science 4 Hindi";
        Scanner s1 = new Scanner(input);
        while(s1.hasNext())
        {
        System.out.print(s1.nextInt()+". ");
        System.out.println(s1.next());
        //System.out.println(s1.nextDouble());
    }
    s1.close();
    
}}
