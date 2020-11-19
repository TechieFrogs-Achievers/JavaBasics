public class AddOfIntegers
 {
     public static void main(String[] args)
      {

        int firstValue = 7;
        int secondValue = 4;
        
        int total = add(firstValue,secondValue);
        int data = sub(firstValue,secondValue);
        
        System.out.println(total);
        System.out.println(data);
      }
        
      public static int add(int x, int y)
        {
            int sum;
            sum = x + y;
            return sum;
        }

        public static int sub(int x, int y)

        {
            int d;
            d= x-y;
            return d;
        }
    
}
