import java.util.Scanner;

public class ScannerValidateInput {
    public static void main(String[] args) {
        ScannerValidateInput demo = new ScannerValidateInput();
        demo.validatePositiveNumber();
    }

    private void validatePositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = scanner.nextInt();
        } while (number < 0);

        System.out.printf("You have entered a positive number %d.\n", number);
    }
}