package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Ramya is a Techiefrog employee";
        
        String s1 = str.replaceAll("\\s", ""); //removing spaces by replacing it with null

        System.out.println(s1);
    }
}
