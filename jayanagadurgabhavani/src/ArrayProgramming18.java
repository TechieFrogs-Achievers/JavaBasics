public class ArrayProgramming18 
{
    public static void main(String[] args) 
    {
        int a[]={33,45,76,98,76};
        int temp=0;
        for(int i=0; i<a.length; i++)//normal ordar array
        {
            System.out.println(a[i]);
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)//ascendhing ordar of array
            {
                if(a[i] > a[j]) 
                {    
                    temp = a[i];    
                    a[i] = a[j];    
                    a[j] = temp;    
                }   
            }
        }
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i]);    
        }   
    }
}
