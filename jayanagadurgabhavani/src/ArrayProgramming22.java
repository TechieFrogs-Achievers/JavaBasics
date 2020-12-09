public class ArrayProgramming22 
{
    public static void main(String[] args) 
    {
        int a[]={34,65,67,99};
        int max=0;
        for(int i=0; i<a.length; i++)//normal ordar of array
        {
            if(a[i]>max)// array largest number og array
            max=a[i];
        }
        System.out.println("largest number of array:"+ max);
    }
}
