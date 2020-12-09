import java.util.Scanner;
public class String105 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = new String("Hari");
        System.out.println((str1 == str2)? "True" : "False");
        System.out.println((str2 == str3)? "True" : "False");
        sc.close();
    }   
}
