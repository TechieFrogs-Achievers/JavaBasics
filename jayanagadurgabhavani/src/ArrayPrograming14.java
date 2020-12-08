public class ArrayPrograming14 
{
    public static void main(String[] args) 
    {
        int a[]={234,756,986,95,78,75};
        int mini=a[0];
        for(int i=0; i<a.length; i++)
        {
            //comparing the array of minimum number
            if(a[i]<mini);
            mini=a[i];
        }
        System.out.println("minimunm number of array:"+mini);
    }
}
