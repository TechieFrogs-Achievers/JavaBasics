package Arrays;

import java.util.Scanner;

public class ElementsOfArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //length of array
        int[] arr = new int[length]; //input
        int[] val = new int[]{21,56,58,56,25,56}; //array elements
        String[] names = new String[]{"jemi","shiri","bindu","eswari"};
        char[] ch=new char[]{'j','e','m','i'};
        for(int i=0;i<arr.length;i++) //reading array elements
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the int values");
        for(int i=0;i<val.length;i++) //printing all array elements
        {
            System.out.println(val[i]);
        }      
        System.out.println(names[2]); //printing index 2 element
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);

        }
        System.out.println("the console array element :"+arr[3]); //printing particular element indexof 3
        sc.close();
    }
    
}
