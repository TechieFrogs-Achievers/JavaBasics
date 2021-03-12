package wiproExcersices;

import java.util.Scanner;
//driver class
public class Difference {
    public static void main(String[] l){

//USING WHILE LOOP::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
     /*   //scanner class to read inputs
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
        System.out.println("DIFFERENCE OF GIVEN NO AND IT'S REVESRE IS:"+ (temp-reverse_no));  */
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;::::::::::::::::::::::::::


//USING RECURSION :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;::::::::::::::::::::::::::

        int num=0;
        System.out.println("Input your number : ");
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        System.out.print("Reverse of the input number is:");
        reverseMethod(num);
        System.out.println();
        n.close();
}
    //method to reverse the given number
    private static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            }
            else {
                System.out.print(number % 10);
                //Method is calling itself: recursion
                reverseMethod(number/10);
            }
    }
    
}
