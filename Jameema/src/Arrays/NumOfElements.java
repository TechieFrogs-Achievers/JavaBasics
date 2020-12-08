package Arrays;

import java.util.Scanner;

public class NumOfElements 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        String[] names = new String[] {"jemi","shiri","bindu","eswari"};
        System.out.println("the num of elements in array is :" +val.length); //prints the number of elements
        System.out.println("the num of elements  :"+names.length );
        sc.close();
    }
    
}
