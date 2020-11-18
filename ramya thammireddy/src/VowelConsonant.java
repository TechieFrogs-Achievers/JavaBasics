public class VowelConsonant 
{
    

        public static void main(String[] args) 
        {
    
            char ch = 'i';
    
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");
    
        }
    
    
}
//using switch 
public class Demo 
{

    public static void main(String[] args) 
    {

        char ch = 'z';

        switch (ch) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}