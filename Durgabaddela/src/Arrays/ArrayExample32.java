public class ArrayExample32
 {
    public static void main(String[] args)
     {
         int count1=0, count2=0;
        int a[] = {3,5,6,7,23,45};//array declaration and initilization
        System.out.println("the frequency even elements are");
        for(int i=0; i<a.length; i++)
        {
            
            if(a[i]%2==0)//condition for even  digits
            {
                count1++;
                //System.out.print(a[i]+" ");
                
            }
        }
        System.out.println(count1);
        System.out.println("the  frequency odd elements are");
        for(int i=0; i<a.length; i++)
        {
             
            if(a[i]%2!=0)//checking for odd elements
            {
                count2++;
                //System.out.println(a[i]+" ");
            }
        }
        System.out.println(count2);
    }
}
