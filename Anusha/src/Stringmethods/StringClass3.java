package Stringmethods;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringClass3 
{
   public static void main(String[] args) 
   {
      String value="31/01/1999";
      System.out.println("date:"+value);
      SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
      Date date1=formatter1.parse(value);  
      System.out.println(value+"\t"+date1);  
   } 
}
