public class ArrayProgramming21 
{
    public static void main(String[] args) 
    {
        int size;
        int aa[]={11,22,44,33,55};
        //size=aa[0];
        size=aa.length;
        for(int i=0; i<size; i++)//norma ordar array
        {
        for(int j=i+1; j<size; j++)//second largest number
        {
            if(aa[i]>aa[j])
            {
              size=aa[i];
              aa[i]=aa[j];
              aa[j]=size;
            }
        }
        }
        System.out.println((size-2));
    }
}
