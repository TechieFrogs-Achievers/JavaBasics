import java.util.Random;
public class StringProgramming10 
{
    public static void main(String[] args)
     {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();// create random string builder
        Random random = new Random();// create an object of Random class
        int length = 7;
        for(int i = 0; i < length; i++) 
        {
          int index = random.nextInt(alphabet.length());// generate random index number

      // get character specified by index
      // from the string
      char randomChar = alphabet.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);

    }
}
