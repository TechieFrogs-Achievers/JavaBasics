package Strings;

import java.util.Scanner;
//program to find/calculate frequency of a perticilar charecter
public class FrequencyOfCharecter {
    public static void main(String[] hb){

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();//neeraja
        int count=0;

        for(int j=0; j<=str.length()-1; j++)
        {
        for(int i=j+1;i<=str.length()-1;i++){
            //if(str.charAt(i)==scan.next().charAt(0))
            if(str.charAt(j)==str.charAt(i)){
                ++count;
            }
        }
        System.out.println("the charecter  "+str.charAt(j) +" present "+count+" no of times");


    }
  }
    
}
