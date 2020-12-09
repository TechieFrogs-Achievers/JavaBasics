 
public class ArrayProgramming25 
{
    public static void main(String[] args) 
    {
        int a[]={66,77,88,99,44,66,44};
        for(int i=0; i<a.length; i++)//normal ordar of array
        {
            System.out.println("normal array order:"+a[i]);
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i]==a[j])//camparing og elements
                  a[i]=a[j];

            }
        }
        System.out.println("removing of elements:"+ a);
    }
 
}
