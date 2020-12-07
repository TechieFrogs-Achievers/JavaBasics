package StringsExercise;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ExampleForStringToDate {
    public static void main(String[] args) throws ParseException 
    {
        Scanner scan = new Scanner(System.in);                  //scanner method
        String date = scan.nextLine();                          //taking date as string
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);            //creating date format
        System.out.println(date1);                          //printing day for given date
        scan.close();
        
        
    }
    
}
