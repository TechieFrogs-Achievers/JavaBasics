public class ArrayProgramming24 
{
    public static void main(String[] args) 
    {
        int a[]={56,77,98,43,22};
        int min=a[0];
        for(int i=0; i<a.length; i++)//normal ordar of array
        {
            if(a[i]<min)// array largest number of array
            min=a[i];
        }
        System.out.println("minimum number of array:"+ min);
    }
}
