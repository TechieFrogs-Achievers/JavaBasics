import java.util.Scanner;

public class AverageOfNumbers {
    // method to return average

    public void returnAverage(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        float average = sum / 3;
        System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking inputs from keyboard

        System.out.println(" enter number1:");
        int a = sc.nextInt();
        System.out.println(" enter number2:");
        int b = sc.nextInt();
        System.out.println(" enter number3:");
        int c = sc.nextInt();

        // creating an object for return value

        AverageOfNumbers ob = new AverageOfNumbers();
     ob.returnAverage(a, b, c);


   
   
 }

}
