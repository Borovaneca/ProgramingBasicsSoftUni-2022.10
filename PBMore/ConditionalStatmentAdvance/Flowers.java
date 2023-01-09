package PBMore.ConditionalStatmentAdvance;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chrysanthemums tulips
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        int sumFlowers = chrysanthemums + roses + tulips;
        int arrangement = 2;
        double discount = 0;
        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                if (holiday.equals("Y")) {
                    chrysanthemumsPrice = chrysanthemums * (2 + (2 * 0.15));
                    rosesPrice = roses * (4.10 + (4.10 * 0.15));
                    tulipsPrice = tulips * (2.50 + (2.50 * 0.15));
                }
                if (holiday.equals("N")) {
                    chrysanthemumsPrice = chrysanthemums * 2;
                    rosesPrice = roses * 4.10;
                    tulipsPrice = tulips * 2.50;
                } break;
            case "Autumn":
            case "Winter":
                if (holiday.equals("Y")) {
                    chrysanthemumsPrice = chrysanthemums * (3.75 + (3.75 * 0.15));
                    rosesPrice = roses * (4.50 + (4.50 * 0.15));
                    tulipsPrice = tulips * (4.15 + (4.15 * 0.15));
                }
                if (holiday.equals("N")) {
                    chrysanthemumsPrice = chrysanthemums * 3.75;
                    rosesPrice = roses * 4.50;
                    tulipsPrice = tulips * 4.15;
                }
                break;
        }
        double total = chrysanthemumsPrice + rosesPrice + tulipsPrice;
        if (tulips > 7 && season.equals("Spring")) {
            discount = total * 0.05;
            total -= discount;
        }
        if (roses >= 10 && season.equals("Winter")) {
            discount = total * 0.10;
            total -= discount;
        }
        if (sumFlowers >= 20) {
            discount = total * 0.20;
            total -= discount;
        }
        total += arrangement;
        System.out.printf("%.2f", total);
    }
}
