public class NestedIf1 {

    public float nestedIfExample()
    {
        float n1 = 1.0f, n2 = 2.3f, n3 = 1.0f, large;
        if ( n1 > n2)
        {
            if (n1 > n3){
                large = n1;
                return large;
            }
            else {
                large = n3;
                //System.out.println(large);
                return large;
            }
        }
        else 
        {
            if (n2 > n3){
                large = n2;
                //System.out.println(large);
                return large;
            }
            else {
                large = n3;
                //System.out.println(large);
                return large;
            }
        }
    }

    public static void main(String args[]) 
    {
        float largest;
        NestedIf obj = new NestedIf();
        largest = obj.nestedIfExample();
        System.out.println(largest);  
    }
}
/*public class NestedIf1 {
    public static void main(String[] args) {
  
      // declaring double type variables
      Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
  
      // checks if n1 is greater than or equal to n2
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
*/