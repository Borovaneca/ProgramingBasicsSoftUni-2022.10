package PBMore.FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prizeVegetable = Double.parseDouble(scanner.nextLine());
        double prizeFruits = Double.parseDouble(scanner.nextLine());
        double totalVegetable = prizeVegetable * Double.parseDouble(scanner.nextLine());
        double totalFruits = prizeFruits * Double.parseDouble(scanner.nextLine());

        double total = (totalVegetable + totalFruits) / 1.94;

        System.out.printf("%.2f", total);
    }
    }

