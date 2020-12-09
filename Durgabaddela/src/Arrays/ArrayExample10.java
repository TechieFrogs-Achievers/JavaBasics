import java.util.Scanner;

public class ArrayExample10 
{
    public static void main(String[] args) 
    {
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
    System.out.println("the  elements of array");
    for(int k:array1)
    {
    System.out.print(k+" ");
    }
    System.out.println();
    int smallest =array1[0];
    for(int i= 1;i <array1.length; i++)
    {
      if(smallest > array1[i])// condition for largest element
      {
          smallest = array1[i];
      }
  }
  System.out.println("the largest element in the given array =" + smallest);
    sc.close();
}

}
