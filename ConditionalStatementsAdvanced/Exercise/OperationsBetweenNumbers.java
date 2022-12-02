package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен.

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        String even = "even";
        String odd = "odd";

        switch (symbol) {
            case "+":
                if ((n1 + n2) % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, n1 + n2);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, n1 + n2);
                }
                break;
            case "-":
                if ((n1 - n2) % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, n1 - n2);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, n1 - n2);
                }
                break;
            case "*":
                if ((n1 * n2) % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, n1 * n2);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, n1 * n2);
                }
                break;
            case "/":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, n1 / (double) n2);
                }
                break;
            case "%":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
                    break;
                }
        }
    }
}