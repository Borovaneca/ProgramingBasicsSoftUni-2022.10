package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double summer = 0;
        double winter = 0;
        double price = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.30;
                summer = budget - (budget * 0.30);
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                winter = budget - (budget * 0.70);
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.40;
                summer = budget - (budget * 0.40);
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                winter = budget - (budget * 0.80);
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 1000) {
            price = budget * 0.90;
            if (season.equals("summer")) {
                summer = budget - (budget * 0.90);
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", price);
            } else if (season.equals("winter")) {
                winter = budget - (budget * 0.90);
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", price);
            }

        }
    }
}