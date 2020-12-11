package ArraysExercise;

import java.util.Scanner;

//class for frequency of each element in an array
public class Example2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class
        int length = scan.nextInt();                        //giving length of an array
        int array[] = new int[length];                      //array initializing
        //taking another array for storing frequency of each element in an array
        int counts[] = new int[length];                     
        int visited = -1;                   //intially taking visited as -1
        //taking count variable for counting how many times element is there
        int count;                          

        //loop for reading array elements
        for(int i = 0; i < array.length; i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }

        //first loop for taking first element in an array
        for(int i =0 ; i< array.length; i++)
        {
            count = 1;
            //loop for taking another element for comparing
            for(int j = i+1; j < array.length; j++)
            {
                //comparing two elements as same or not  
                if(array[i] == array[j])  
                {
                    //if two elements are same then count is incrementd
                    count++; 
                    //second element is already visited then it taking visited(i.e taking multiple times one element)
                    counts[j] = visited;            
                }
            }
            //if freuency of element is not equal to -1 then that freuency of that element is count
            if(counts[i] != visited)
            {
                counts[i] = count;
                
            }
            
        }
        //loop for printing freyency array
        for(int i =0; i < counts.length; i++)
        {
            if(counts[i] != visited)
            {
                System.out.println(array[i] + " " +counts[i]);
            }
            
        }
        scan.close();               //scanner close
    }
    
}
