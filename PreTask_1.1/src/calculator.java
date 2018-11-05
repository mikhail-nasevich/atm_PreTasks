import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("First number to calculate: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Select type of operation (*,/,+,-): ");
        String operation = scanner.next();
        System.out.print("Second number to calculate: ");
        int secondNumber = scanner.nextInt();

        switch (operation) {
            case "*":
                System.out.println("Multiplication... Your Result: "+ ( firstNumber * secondNumber ));
                break;
            case "/":
                System.out.println("Division... Your Result: "+ ( firstNumber / secondNumber ));
                break;
            case "+":
                System.out.println("Sum... Your Result: "+ ( firstNumber + secondNumber ));
                break;
            case "-":
                System.out.println("Difference... Your Result: "+ ( firstNumber - secondNumber ));
                break;
            default: System.out.println("Please select a valid character");
        }

        scanner.close();
        System.out.println(" Good Luck! ");
    }
}
