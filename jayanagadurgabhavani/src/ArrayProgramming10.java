public class ArrayProgramming10 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0; i<a.length; i++)//normal ordar elements
        {
            System.out.println("elemints normal ordar:"+a[i]);
        }
        for(int i=a.length-1; i>=0; i--)//revers of elements
        {
            System.out.println("revers of elemints:"+a[i]);
        }
    }
}
