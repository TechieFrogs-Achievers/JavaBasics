package StringsExercise;

import java.util.Scanner;

public class ExampleOnComparison 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    //scanner method
        //strings creation
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = new String(sc.nextLine());
        //equals method
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        //== operator
        System.out.println();
        System.out.println(str == str1);
        System.out.println(str1 == str3);
        //compareTo()
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str3));
        sc.close();
    }
    
}
