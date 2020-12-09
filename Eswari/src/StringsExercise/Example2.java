package StringsExercise;
import java.util.Scanner;

public class Example2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class
        int length = scan.nextInt();                            //length of string array
        String words[] = new String[length];                    //creating string array
        for(int i = 0; i < length ;i++)
        {
            words[i] = scan.next();                     //giving array of words
        }

        
       // System.out.println(words.toString());
        for(int i = 0; i < length-1; ++i)                       //loop for taking first word
        {
            for(int j = i + 1;j < length;++j)                   //loop for taking second word
            {
                if (words[i].compareTo(words[j]) > 0)           //checking words lexographic order
                {
                    //swapping method
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        //loop for printing words after swamming
        for(int i = 0;i < words.length; i++)

        {
            System.out.println(words[i]);
        }
        scan.close();                       //scanner close
    }
    
}
