package Arrays;
import java.util.*;
public class SpiralModel
{
    public static void main(String[] args) 
    {
        // create object.
		Scanner sc = new Scanner(System.in);

		// enter the number of elements.
		System.out.print("Enter the number of elements for pattern : ");
		int n = sc.nextInt();
		
		int A[][] = new int[n][n];//2d array
		int k=1, c1=0, c2=n-1, r1=0, r2=n-1;

		while(k<=n*n)
		{
			for(int i=c1;i<=c2;i++)//for loop for row elements
			{
				A[r1][i]=k++;
			}

			for(int j=r1+1;j<=r2;j++)//for loop for col elements
			{
				A[j][c2]=k++;
			}

			for(int i=c2-1;i>=c1;i--)//for loop to move right to left
			{
				A[r2][i]=k++;
			}

			for(int j=r2-1;j>=r1+1;j--)//for loop to move doen to up
			{
				A[j][c1]=k++;
			}
			
			c1++;
			c2--;
			r1++;
			r2--;
		}

		/* Printing the Spiral pattern */
		System.out.println("The Spiral pattern is : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+ "\t");
			}
			System.out.println();
		}
    }
}
