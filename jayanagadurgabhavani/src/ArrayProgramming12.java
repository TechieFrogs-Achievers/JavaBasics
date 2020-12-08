public class ArrayProgramming12 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0; i<a.length; i=i+2)//odd ordar of elements
        {
            System.out.println("odd elements of array:"+a[i]);
        }
    }
}
