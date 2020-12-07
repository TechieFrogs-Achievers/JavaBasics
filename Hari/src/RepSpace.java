import java.util.Scanner;
public class RepSpace 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String sentence = sc.nextLine(); // creating object for the sentence
        String newsen = sentence.replace(" ","V");
        System.out.println(newsen);
        sc.close();
    }   
}
