package Strings;

import java.util.Scanner;

public class Lexicographical {
    public static void main(String[] args) {
    
        int length = 5;
       String words[]=new String[length];
       Scanner s = new Scanner(System.in);
       for(int i =0;i<length;i++){
           words[i] = s.next();
       }
       for(int i = 0;i<5;i++){

        for (int j=i+1;j<5;j++){

            if(words[i].compareTo(words[j])>0){
                
                //swaping the words
                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
            }
        }
    }
    s.close();
    //for printing the word in array
    for (int i = 0;i<5;i++){
        System.out.println(words[i]);
        }
    }
}


