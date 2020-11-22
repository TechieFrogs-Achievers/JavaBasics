public class DefaultExample
 {

     public static void main(String[] args) 
     {
        Area arr = new Area(); // object creation for area class
        
        arr.setDim(4,5); // method calling from area class for assigning values
        
        System.out.println(arr.getArea()); // printing the area by calling method

    }
}
