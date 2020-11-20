public class NestedIf {
    public static void main(String args[]) {
       int n1=5;
       int n2=4;
       int n3=3;
       int largest;
        if (n1 >= n2) {

            // if...else statement inside the if block
            // checks if n1 is greater than or equal to n3
            if (n1 >= n3) {
              largest = n1;
            }
      
            else {
              largest = n3;
            }
          } else {
      
            // if..else statement inside else block
            // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
              largest = n2;
            }
      
            else {
              largest = n3;
            }
          }
      
          System.out.println("Largest Number: " + largest);
      
        
    }
    
}
