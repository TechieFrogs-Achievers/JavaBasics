public class StringProgrammin31 
{
    public static void main(String[] args) 
    {
        String sentence = "jaya     naga     durga    bhavani";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}
