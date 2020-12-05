public class StringProgramming17 
{
    public static void main(String[] args) 
    {
        // create a string
    String name = "jaya";

    System.out.println("Characters in " + name + " are:");

    // loop through each element
    for(int i = 0; i<name.length(); i++) {

      // access each character
      char a = name.charAt(i);
      System.out.print(a + ", ");
    }
    }
}
