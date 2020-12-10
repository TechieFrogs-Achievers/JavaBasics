public class ArrayExample8 
{
    public static void main(String[] args)
    {
        int a[] = {3,5,6,7,23,45};//array declaration and initilization
        System.out.println("the array elements are");
        for(int k:a)//for ecah loop to print the array elemants 
        {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("the array elements in odd position are");
        for(int i=0; i<a.length; i++)
        {
            if(i%2!=0)//condition for odd position digit
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();

    }
}
