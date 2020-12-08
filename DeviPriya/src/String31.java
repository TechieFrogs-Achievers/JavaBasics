public class String31 {
    public static void main(String[] args) 
    { 
        String str = "      ab cd ef df      "; 
       
        // Call the replaceAll() method 
        str = str.replaceAll("\\s", ""); 
       
        System.out.println(str); 
    } 
    
}
