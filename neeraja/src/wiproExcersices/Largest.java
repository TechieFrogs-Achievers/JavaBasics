package wiproExcersices;

import java.util.Arrays;
import java.util.Scanner;

class Demo
{
 public int firstLargest(int number)
    {
        int largest=0;
     while(number>0)
    {
        int r=number%10;
        largest =Math.max(r,largest);
        number=number/10;
    }
        return largest;
    }

 public int secondlargest(int number) {
        char []array=Integer.toString(number).toCharArray();
        Arrays.sort(array);
        int length=array.length;
        return Character.getNumericValue(array[length - 2]);
    }
}
public class Largest
{
    public static void main(String[] args) 
    {
    Demo d =new Demo();
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int lar_sum=0,sec_lar=0;
    for(int i=0;i<n;i++){
        int number=sc.nextInt();
      lar_sum=lar_sum+d.firstLargest(number);
      sec_lar=sec_lar+d.secondlargest(number);
    }
   sc.close();
   int result= (lar_sum)-(sec_lar);
   System.out.println(result);
    }
}
