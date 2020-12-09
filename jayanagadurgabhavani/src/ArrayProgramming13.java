public class ArrayProgramming13 
{
    public static void main(String[] args) 
    {
        int a[]={566,546,77,90,76,436};
        int max=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)//compare elemnts of array max
            max=a[i];
        }
        System.out.println("largest elemnet of array:"+max);
    }
}
