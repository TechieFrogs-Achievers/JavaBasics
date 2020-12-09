package StringExamples;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class StringToDateP3 
{
    public static void main(String[] args) throws ParseException 
    {
        
         String date = "26/4/1999";

         //parse method is used to convert string to form a date

          Date converteddate = new SimpleDateFormat("dd/MM/yyyy").parse(date); //using date class to generate date in words

        System.out.println(converteddate);   
    }
}
