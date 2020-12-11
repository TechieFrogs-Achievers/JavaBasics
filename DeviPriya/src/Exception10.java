public class Exception10 {
    public static void main(String[] args) 
    { 
        try { 
            int number[] = new int[10]; 
            number[10] = 30 / 0; 
        } 
        catch (ArithmeticException e) { 
            System.out.println( 
                "Zero cannot divide any number"); 
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println( 
                "Index out of size of the array"); 
        } 
    } 
    
}
