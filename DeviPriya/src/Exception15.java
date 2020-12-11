public class Exception15 {
    public static void main(String[] args) { 
    int arrSize = -8;
try {
    int[] myArray = new int[arrSize];
} catch (NegativeArraySizeException ex) {
    System.out.println("Can't create array of negative size");
}
    
}
}
