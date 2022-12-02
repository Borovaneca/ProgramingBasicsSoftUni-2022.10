package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int mid = 0;
        double sumMid = 0;
        double sumTotal = 0;

        while (!name.equals("Finish")){

            sumMid = 0;
            for (int i = 0; i < quantity; i++) {

                double degree = Double.parseDouble(scanner.nextLine());
                sumMid += degree;
            }
            sumMid = sumMid / quantity;
            mid++;
            sumTotal += sumMid;
            System.out.printf("%s - %.2f.\n", name, sumMid);

            name = scanner.nextLine();
        }
        double totalSum = sumTotal / mid;
        System.out.printf("Student's final assessment is %.2f.", totalSum);
    }
}
