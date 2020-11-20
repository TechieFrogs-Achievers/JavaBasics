public class CheckAlphabet {
    public static void main(String[] args) {

        char c = '1';
        
      String Result = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(Result);
    }

    
}
