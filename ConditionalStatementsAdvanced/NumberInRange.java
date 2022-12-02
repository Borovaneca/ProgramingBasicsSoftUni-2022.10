package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean number = num >= -100 && num <= 100 && num != 0;

        if (number) {
            System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

