package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hoursNeed = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint + 0.1 * paint) * 14.50;
        double sumThinner = thinner * 5.0;
        double bags = 0.40;
        double allMats = sumNylon + sumPaint + sumThinner + bags;
        double sumMasters = (allMats * 0.3) * hoursNeed;
        double total = allMats + sumMasters;

        System.out.println(total);

    }
}
