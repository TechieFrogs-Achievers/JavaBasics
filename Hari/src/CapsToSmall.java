import java.util.Scanner;
public class CapsToSmall 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();  // creating object for a string
        String newstr = str.replace(str,str.toLowerCase()); // replacing capital letters to small letters
        System.out.println(newstr);
        sc.close();
    }  
}
