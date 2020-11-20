public class Method {
    
        public int addNumbers {
          int sum = a + b;
        
          return sum;
        }
      
        public static void main(String[] args) {
          
          int num1 = 25;
          int num2 = 15;
      
        
          Main obj = new Main();
          // calling method
          int result = obj.addNumbers();
          System.out.println("Sum is: " + result);
        }
}
