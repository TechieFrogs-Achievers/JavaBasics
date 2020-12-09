import java.util.*;
public class NumberOfWords 
{
 public static void main(String[] args)
  {
    int count = 0;
    int words;
    Scanner sc = new Scanner(System.in);        //create scanner object and read the value from console
    System.out.println("Enter sentence");
    String string = sc.nextLine();          //read the value
    for(int i=0;i<string.length();i++)          //for loop to count the characters
    {
        if(string.charAt(i)!=' ')
        {
            count++ ;
        }
    }
    words = string.length()-count+1;
    System.out.println("No.of words in the sentence ="+ words);     //print the words
    sc.close();

}
}
