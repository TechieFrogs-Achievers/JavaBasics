package Arrays;
import java.util.*;
public class FrequencyOfEvenOddCount 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int evenCount=0,oddCount=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]%2==0)
                {
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
        }
        System.out.println("Frequency of Even number:"+evenCount);
        System.out.println("Frequency of odd number:"+oddCount);
        sc.close();
    }
}
