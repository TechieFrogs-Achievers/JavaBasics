public class SumOfNatural {
    public static void main(String[] args) {

        int num = 10, count, total = 0;
 
        for(count = 1; count <= num; count++){
            total = total + count;
        }
 
        System.out.println("Sum of first 10 natural numbers is: "+total);
     }
 
    
}
