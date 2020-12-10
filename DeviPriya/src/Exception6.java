public class Exception6 {
    public static void main(String[] args) 
    {
   // Main try block 
   try { 
  
    // initializing array 
    int a[] = { 1, 2, 3, 4, 5 }; 

    // trying to print element at index 5 
    System.out.println(a[5]); 

    // try-block2 inside another try block 
    try { 

        // performing division by zero 
        int x = a[2] / 0; 
    } 
    catch (ArithmeticException e2) { 
        System.out.println("division by zero is not possible"); 
    } 
} 
catch (ArrayIndexOutOfBoundsException e1) { 
    System.out.println("ArrayIndexOutOfBoundsException"); 
    System.out.println("Element at such index does not exists"); 
} 
} 
// end of main method 
}
