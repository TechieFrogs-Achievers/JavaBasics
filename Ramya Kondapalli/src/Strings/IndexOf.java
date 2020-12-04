package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); //user input
        String str2 = new String("Kondapalli");  //static input 

        System.out.println("index of 'm' :" + str1.indexOf('m'));  //2
        System.out.println("index of 'p' :" + str2.indexOf('p'));  //5

        char[] arr = {'R','a','m','y','a'};
        System.out.println(Arrays.toString(arr));
        char s = 'a';

        // int index = Chars.indexOf(arr, s);
        // System.out.println(index);
        
    }
}

