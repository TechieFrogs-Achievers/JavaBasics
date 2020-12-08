package Strings;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

//import javax.print.attribute.standard.DateTimeAtCompleted;

public class Date 
{
   // private static final String Date1 = null;

    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
       // String s=sc.nextLine();
        String string = "1999-06-01"; //date formate
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE); //packages created object 
        System.out.println(date);
        sc.close();
     /* String s = "31-Dec-1998 23:37:50";  
      SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
      Date date1=formatter1.parse(s);  
    System.out.println(Date1+"\t"+date1);  */

        
    }
    
}
