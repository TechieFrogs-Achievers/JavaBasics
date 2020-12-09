package Arrays;

import java.util.Scanner;

public class Array22evenodd
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);//input user
        int n=sc.nextInt(); //read the elements
        int arr[]=new int[n]; //elemts of arrlen
        //int count=0;
        for(int i=0;i<arr.length;i++) //loop for len
        {
            arr[i]=sc.nextInt(); // read the elem
        }
        for(int i=0;i<arr.length;i++) //read the elem
        {
            if(arr[i]%2==0) //condtion
            {
              //  System.out.println("even poistions");
            System.out.println(" even number:"+arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++) //read the elem
        {
            if(arr[i]%2==1) //condtion
            {
               // System.out.println("odd positions");
            System.out.println(" odd number:"+arr[i]);
            }

            sc.close();
        }

    }
}
