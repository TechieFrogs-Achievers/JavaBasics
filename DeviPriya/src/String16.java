import java.util.*;
public class String16 {
    public static void main(String[] args) {
    
   // Scanner sc = new Scanner(System.in);
    //String s = sc.nextLine();
    //System.out.println(StringFormatter.capitalizeWord(s));
    //public static String capitalizeWord(String str){  
        String words[]=str.split("\\s");  
        String capitalizeWord="";  
        for(String w:words){  
            String first=w.substring(0,1);  
            String afterfirst=w.substring(1);  
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        }  
        return capitalizeWord.trim();  
    }  
    //System.out.println(StringFormatter.capitalizeWord(Devi priya));
    

    
}
}
