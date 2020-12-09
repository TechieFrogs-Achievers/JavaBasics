package Arrays;

import java.util.Scanner;

public class ArrayExample1
 
{
    public static void main(String[] args) 
    {
        
    /*int arr[] = {2,3,5,8,6};//array declaration with values
    System.out.println("the array elements before ");
    for(int i=0;i<arr.length; i++)
    {
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    int a[] =new int[5];//copting array with size
    Object src;
    int srcPos;
    Object dest;
    int destPos;
    int length;
    System.arraycopy(arr, 0, a, 0, 5);//array copy method to copy the elements
    System.out.println("the array elements before ");
    for(int j=0; j<a.length; j++)
    {
    System.out.print(a[j]+" ");
    }
    System.out.println();*/

    //using cloning
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the array");
     n = sc.nextInt();//taking length from keyboard
    int array1[] = new int[n];//passing length to array
    System.out.println("enter the array elements");
    for(int i=0; i<n; i++)
    {
        array1[i] = sc.nextInt();//taking array elements from keyboard
        //System.out.print(array1[i]+" ");
    }
    System.out.println("the original element of array");
    for(int k:array1)
    {
    System.out.print(k+" ");
    }
    System.out.println();
    int C_array[] = array1.clone();//cloning method to copy the alla elements
    System.out.println("after coyping of elements");
    for(int j:C_array)
    {
        System.out.print(j+" ");//after clonig 
    }
    System.out.println();
    sc.close();

    }
    
}
