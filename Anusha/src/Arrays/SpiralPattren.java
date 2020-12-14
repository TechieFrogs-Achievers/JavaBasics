package Arrays;
import java.util.*;
public class SpiralPattren 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //scanner class
        System.out.println("Enter the size : ");
        int size=sc.nextInt();//taking size from console
        spiral(size);//method calling
    }   
    
    public static void spiral(int size)
    {
        int rows = 0, cols = 0; // Create row and col
  
        int boundary = size - 1; //boundary value
        int sizeLeft = size - 1; 
        int flag = 1; 
        char move = 'r';
        // Array  for matrix 
        int matrix[][] = new int[size][size];
        for (int i = 1; i < size * size + 1; i++) 
        { 
              // Assign the value 
            matrix[rows][cols] = i; 
  
            // switch-case to determine the next index 
            switch (move) { 
  
            // If right, go right 
            case 'r': 
                cols += 1; 
                break; 
  
            // if left, go left 
            case 'l': 
                cols -= 1; 
                break; 
  
            // if up, go up 
            case 'u': 
                rows -= 1; 
                break; 
  
            // if down, go down 
            case 'd': 
                rows += 1; 
                break; 
            } 
  
            // Check if the matrix 
            if (i == boundary) 
            { 
                  // Add the left size for the next boundary 
                boundary += sizeLeft; 
  
                // If 2 rotations has been made, 
                // decrease the size left by 1 
                if (flag != 2) 
                { 
  
                    flag = 2; 
                } 
                else 
                { 
  
                    flag = 1; 
                    sizeLeft -= 1; 
                } 
  
                // switch-case to rotate the movement 
                switch (move) 
                { 
  
                // if right, rotate to down 
                case 'r': 
                    move = 'd'; 
                    break; 
  
                // if down, rotate to left 
                case 'd': 
                    move = 'l'; 
                    break; 
  
                // if left, rotate to up 
                case 'l': 
                    move = 'u'; 
                    break; 
  
                // if up, rotate to right 
                case 'u': 
                    move = 'r'; 
                    break; 
                } 
            } 
        } 
  // Print the matrix 
  for (rows = 0; rows < size; rows++) { 
    for (cols = 0; cols < size; cols++) { 

        int n = matrix[rows][cols]; 
        //for spaces
       if(n<10)
       {
           System.out.print(n+"   ");
       }
       else{
           System.out.print(n+"  ");
       }

    } 

    System.out.println(); 
} 
} 
 
        

    
}
