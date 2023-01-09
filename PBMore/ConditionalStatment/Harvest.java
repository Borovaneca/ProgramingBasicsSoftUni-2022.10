package PBMore.ConditionalStatment;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double harvestPerM = Double.parseDouble(scanner.nextLine());
        int neededLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double areaRemain = (area * harvestPerM) * 0.40;
        double areaWine = areaRemain / 2.5;

        if (neededLiters > areaWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLiters - areaWine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(areaWine));
            double difference = areaWine - neededLiters;
            double litersPerWorkers = difference / workers;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(areaWine - neededLiters), Math.ceil(litersPerWorkers));
        }
    }

}

