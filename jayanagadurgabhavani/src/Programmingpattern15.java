public class Programmingpattern15
 {
    static void Alphabet_N_Pattern(int N) 
{ 
  
    int index, side_index, size; 
  
    // Declaring the values of Right, Left and Diagonal values 
    int Right = 1, Left = 1, Diagonal = 2; 
  
    // Main Loop for the rows 
    for (index = 0; index < N; index++) { 
  
        // For the left Values 
        System.out.print(Left++); 
  
        // Spaces for the diagonals 
        for (side_index = 0; side_index < 2 * (index); side_index++) 
            System.out.print(" "); 
  
        // Condition for the diagonals 
        if (index != 0 && index != N - 1) 
            System.out.print(Diagonal++); 
        else
            System.out.print(" "); 
  
        // Spaces for the Right Values 
        for (side_index = 0; side_index < 2 * (N - index - 1); side_index++) 
            System.out.print(" "); 
  
        // For the right values 
        System.out.print(Right++); 
  
        System.out.println(); 
    } 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // Size of the Pattern 
    int Size = 6; 
  
    // Calling the function to print the desired Pattern 
    Alphabet_N_Pattern(Size); 
} 
  
}
