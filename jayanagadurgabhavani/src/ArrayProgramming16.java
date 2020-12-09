public class ArrayProgramming16 
{
    public static void main(String[] args) 
    {
        int a[]={76,77,32,92,87,7};
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];//sum of all the items of the array
        }
        System.out.println("the sum of all the items of the array:"+sum);
    }
}
