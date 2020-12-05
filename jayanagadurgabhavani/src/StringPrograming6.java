import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringPrograming6 
{
    public static void main(String[] args) 
    {
        String string = "1997-06-23";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
