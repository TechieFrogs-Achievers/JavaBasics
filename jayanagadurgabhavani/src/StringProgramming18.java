public class StringProgramming18 
{
    public static void main(String[] args)
     {
        // create a string
    String name = "jaya";

    System.out.println("Characters in string \"" + name + "\":");

    // loop through each element using for-each loop
    for(char c : name.toCharArray()) {

      // access each character
      System.out.print(c + ", ");
    }
    }
}
