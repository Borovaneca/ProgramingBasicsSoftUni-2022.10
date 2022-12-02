package For;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int pos = 1; pos <= n; pos++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (pos % 2 == 0 ){
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        if (oddSum == evenSum){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(oddSum - evenSum));
        }
    }
}
