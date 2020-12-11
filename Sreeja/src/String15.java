import java.util.*;
public class String15 
{
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);    //create scanner class object

        System.out.println("Enter a sentence");

        String str = sc.nextLine();     //read the string from user

        String words[]= str.split(" ");       //split the words
        String capWord = "";
        for(String w:words)         //for each loop
        {
            String  firstLetter = w.substring(0,1);     //getting first letter
            String remaining = w.substring(1);              //getting remaining strings
            capWord+=firstLetter.toUpperCase() +remaining+" ";      //combining strings
        }
        System.out.println(capWord.trim());
        sc.close();

        



            
        

    }
}
