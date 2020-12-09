public class ArrayProgramming19 
{
    public static void main(String[] args) 
    {
        int a[]={77,64,76,98,86,9};
        int temp=0;
        for(int i=0; i<a.length; i++)//narmal ordar array
        {
            System.out.println(a[i]);
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)//decendhing ordar array
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
           System.out.println(a[i]);
        }

    }
}
