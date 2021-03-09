package Strings;

import java.util.Scanner;
//program to find/calculate frequency of a perticilar charecter
public class FrequencyOfCharecter {

    public static void main(String[] hb){

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();//neeraja(String input)
        int count=0;
        int fre[]=new int[str.length()];
        char[] c=str.toCharArray();
         //iterating each and every charecter in astring
     for(int j=0; j<=str.length()-1; j++)
        {
            fre[j]=1;
        //chcking duplicate charecter with respect to first charecter vice versa
        for(int i=j+1;i<=str.length()-1;i++){
        
            if(c[i]==c[j]){
                fre[j]++;
                c[i]=0;
            }
         }
       }
       for(int j=0; j<=str.length()-1; j++)
        {
            System.out.println(c[j] +"--"+fre[j]+"no oftimes");
        }
  }
    
}

