package StringExercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringProgram3 {
    public static void main(String[] args) throws ParseException 
    {
        System.out.println(" Enter the date:");
        Scanner sc = new Scanner(System.in);// creating  object
        String str = sc.nextLine();// data type
        String str1 = sc.nextLine();
        Date dobj =  new SimpleDateFormat("yyyy-MM-dd").parse(str);// condition for displaying data
        Date d1 =  new SimpleDateFormat("dd/MM/yyyy").parse(str1);// another way for displaying data
        System.out.println(str + "\t" +dobj);// printing
        System.out.println(str1 + "\t" + d1);
        sc.close();// closing scanner class
        
        
    }
    
}
