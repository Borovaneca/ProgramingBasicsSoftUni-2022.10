package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeInMounts = Integer.parseInt(scanner.nextLine());
        double yearInterest = Double.parseDouble(scanner.nextLine());

        double total = depositSum + timeInMounts * ((depositSum * (yearInterest / 100)) / 12);

        System.out.println(total);
    }
}
