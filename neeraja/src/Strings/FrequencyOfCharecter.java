package Strings;

import java.util.Scanner;

public class FrequencyOfCharecter {
    public static void main(String[] hb){

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;

        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("the charecter a present "+count+"no of times");
    }
    
}
