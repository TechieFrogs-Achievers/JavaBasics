package StringsExercise;

import java.util.Scanner;

public class Example15 
{
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("hello");
        // sb.append("java");
        // System.out.println(sb);

        Scanner scan =new Scanner(System.in);
        String sb = scan.nextLine();
        String words[] = sb.split(" ");
        String words1 = "";
        for(int i =0; i < words.length; i++)
        {
            words1 += Character.toUpperCase(words[i].charAt(0)) +words[i].substring(1) +" ";

        }
        System.out.println(words1);
        scan.close();

    }
    
}
