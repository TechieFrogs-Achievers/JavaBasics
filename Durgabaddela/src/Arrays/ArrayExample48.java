import java.util.Scanner;

public class ArrayExample48
{
    public static void main(String[] args)
    {
        int found=0;
       int array[] = {2,3,4,6,76,45,23}; //array declaration with elements in array
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the element to check ");
       int n = sc.nextInt();
       for(int i=0;i<=array.length-1;i++)
       {
           if(array[i] == n)//condition for the element present or not
           {
               found++;//if element is found the count increases
           }
       }
       if(found == 1)
       {
          System.out.println("the given element is present in array");
       }
       else
       {
           System.out.println("the given element is not present in an array");
       }
       sc.close();
    }
}
