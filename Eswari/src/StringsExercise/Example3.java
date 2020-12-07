package StringsExercise;

import java.util.Scanner;

public  class Example3 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);              //scanner method
        String str = scan.nextLine();
        String[] words = str.split(" ");                    //splliting the words where the space is there

        
        for(int i = 0; i< words.length; i++)
        {
            // System.out.println(words[i]);
            //words[i] = words[i].charAt(0).toUpperCase();
            words[i] = words[i].toUpperCase();                      //changing the words to uppercase
            System.out.print(words[i] +" ");
        }
        scan.close();                                       //scanner close
    }

}
