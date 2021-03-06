package wiproExcersices;

import java.util.Scanner;
//driver class
public class Difference {
    public static void main(String[] l){
        //scanner class to read inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt();
        int reverse_no=0;
        int temp=n;
        sc.close();
    //loop to itereate each symbol in a given number
     while(n!=0){
       int reminder=n%10;
         reverse_no=(reverse_no*10)+(reminder);//logic to reverse the given umber
         n=n/10;
        }
        //print output
        System.out.println("DIFFERENCE OF GIVEN NO AND IT'S REVESRE IS:"+ (temp-reverse_no));

    }
    
}
