package Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringExercise3 {
    public static void main(String[] args) throws ParseException 
    {
        System.out.println("enter date:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        System.out.println(s+ "\n" +date);
        sc.close();
        
        
    }
    
}
