public class StringProgramming19 
{
    public static void main(String[] args) 
    {
       //create a string
    String txt = "This is jaya";
    String str1 = "jaya";
    String str2 = "jaya";

    // check if name is present in txt
    // using contains()
    boolean result = txt.contains(str1);
    if(result) {
      System.out.println(str1 + " is present in the string.");
    }
    else {
      System.out.println(str1 + " is not present in the string.");
    }

    result = txt.contains(str2);
    if(result) {
      System.out.println(str2 + " is present in the string.");
    }
    else {
      System.out.println(str2 + " is not present in the string.");
    }
    }
}
