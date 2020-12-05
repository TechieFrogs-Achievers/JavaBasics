package Strings;


import java.text.ParseException;   
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringExercise3 {
    public static void main(String[] args) throws ParseException 
     {
         System.out.println("Enter the Day:");
         Scanner sc = new Scanner(System.in);    //scanner class
         String str = sc.nextLine();
         Date d = new SimpleDateFormat("dd/MM/yyyy").parse(str);   //Gives the date 
         String str1 = sc.nextLine();
         Date d1 = new SimpleDateFormat("mm-yyyy-dd").parse(str1);
         System.out.println(str+"\n"  +d);  //prints the str 
         System.out.println(str+"\n"+d1);
         sc.close();   //scanner close
         

     }
    
}
