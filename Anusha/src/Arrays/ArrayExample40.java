package Arrays;
import java.util.*;
public class ArrayExample40 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number"); 
        int n=sc.nextInt();
        double[] input=new double[n];
        double sum=0,mean;
        System.out.println("enter n elements");	
        for(int i=0;i<n;i++) //enter elements
        {
            input[i]=sc.nextDouble();
            sum=sum+input[i];//addition
        }
               mean=sum/n;//claclulate mean
               System.out.println("Mean :"+mean);
        sum=0;  
        for(int i=0;i<n;i++) 
        {
            sum+=Math.pow((input[i]-mean),2);//The formula to find the variance is Variance= Sum of Square of Difference of mean with individual element/Total Number.
        }
        mean=sum/(n-1);
        double deviation=Math.sqrt(mean);//Standard Deviation is square-root of variance.
        System.out.println("standard deviation :"+deviation);
    
}
