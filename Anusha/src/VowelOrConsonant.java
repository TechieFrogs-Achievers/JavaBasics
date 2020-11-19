import javax.lang.model.util.ElementScanner14;

public class VowelOrConsonant
{
    //main method
    public static void main(String[] args)
    {
        char ch='R';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') //false
        {
            System.out.println("the given letter is vowel ");
        }
        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')//false
        {
            System.out.println("the given letter is vowlel ");
        }
        else//true
        {
            System.out.println("given letter is consonant");
        }
    }
}
