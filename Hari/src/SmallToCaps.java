import java.util.Scanner;
public class SmallToCaps 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        String newstr = str.replace(str,str.toUpperCase());
        System.out.println(newstr);
        sc.close();
    }   
}
