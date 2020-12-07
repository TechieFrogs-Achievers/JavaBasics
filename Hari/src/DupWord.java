import java.util.Scanner;
public class DupWord 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String string = sc.nextLine();   // creating an object for string
        int count ; 
        string = string.toLowerCase();  // converting sentence to small letters
        String words[] = string.split(" ");   // splitting the sentence into words
        System.out.println("The Duplicate words in the sentence are : ");
        for(int i = 0; i < words.length ; i++ )
        {
            count = 1 ;
            for( int j = i+1 ; j < words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++ ;
                    words[j] = "0" ;  // to avoid printing visited words
                }
            }
            if(count > 1 && words[i] != "0")
            System.out.println(words[i]);
        }
        sc.close();
    }   
}
