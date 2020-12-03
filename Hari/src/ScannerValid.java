import java.util.Scanner;
public class ScannerValid {
    public static void main(String[] args)
    {
        System.out.println("Enter any positive number : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            {
                if( num > 0)
                {
                    System.out.println("Number is positive number");
                }
                else{
                    System.out.println("Number is not positve number");
                }
            }
        }
        else
        {
            System.out.println("Give a valid one");
        }
        sc.close();
    }    
}
