public class ArrayExample6
 {
     public static void main(String[] args) {
         
    int arr[] = {2,4,5,68,20};//array declaration and initialization
        System.out.println("the array elements are");
        for(int k:arr)//for ecah loop to print the array elemants 
        {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("the array elements in reverse order");
        for(int j=arr.length-1; j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }

}
