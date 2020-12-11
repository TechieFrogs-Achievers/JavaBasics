package Arrays;

public class ArrayExample27 
{
    public static void main(String[] args) 
    {
        int arr1[][] = {{4,5,6},{7,8,9},{2,5,8}};
        int arr2[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int flag=1;
        int n=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)//condition for equal matrix
            {
                if(arr1[i][j]!=arr2[i][j])//matrix not equal
                   flag=0;
            }
        }
             if(flag==1)//check condition for equal matrix
                    System.out.println("Both the matrices are equal");
             else
                    System.out.println("Both the matrices are not equal");
            
     }
}
