package Strings;


import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StringToDate{
    public static void main(String[] args) throws ParseException 
    {
        Scanner scan = new Scanner(System.in);  //scanner object
        String date = scan.nextLine();    //taking date as string
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);  //converting String to date 
        //SimpleDateFormat date2 = new SimpleDateFormat("EEEE");
        //String format= ((DateFormat) date1).format(date2);
        
        System.out.println(date1);   //printing day for given date
        scan.close();
        
     }
    
}
