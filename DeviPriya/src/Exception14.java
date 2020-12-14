public class Exception14 {
    public static void main(String[] args) {  
        //array of integers
        Integer[] intArray = {10,20,30,40,50};   
        //index = 0; accessing element is successful
        System.out.println("First element: " + intArray[0]);
        //index = -4; accessing fails. Exception thrown
        System.out.println("Last element: " + intArray[-4]);
    }  
}
