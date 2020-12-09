public class StringProgramming33 
{
    public static void main(String[] args) 
    {
        String string = "jaya naga durga bhavani";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }
}
