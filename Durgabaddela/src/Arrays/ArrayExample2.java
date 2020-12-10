import java.util.Scanner;

public class ArrayExample2
 {
    public static void main(String[] args)
     {
        int a[] = new int[5];
        int count =0;
        int visited = -1;  
        int b[] = new int[5];
        System.out.println("enter array elements : ");

        Scanner sc = new Scanner(System.in); //creating scanner obj

        for( int i = 0; i< 5 ; i++)
        {
            a[i] = sc.nextInt(); //taking input from keyboard
        } 

        for(int i : a) //for each loop to print array elements
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("repeated elements an array ");

        for(int i=0; i<5; i++) //loop for repeated elements
        {
            count=1;
            for(int j=i+1; j<5; j++)
            {
                if(a[i]==a[j] ) //both elements are equal then increases count
                {
                    count++;
                    //if alredy value is visited then then value is -1
                    b[j] = visited; 
                }
            } 
            if(b[i] != visited) //if value is not -1 then count increases
            {
                b[i] = count;

            }

        }
        //loop for printing freyency array
        for(int i =0; i < b.length; i++)
        {
            if(b[i] != visited)
            {
                System.out.println(a[i] + " is " + b[i] + " times.\n");
            }
        }   
        sc.close();
    }
}
