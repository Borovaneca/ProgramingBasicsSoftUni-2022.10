package PBMore.PBExams;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String taste = scanner.nextLine();
        String type = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (taste) {
            case "Watermelon":
                if (type.equals("small")) {
                    price = 56 * 2;
                }
                if (type.equals("big")) {
                    price = 28.70 * 5;
                }
                break;
            case "Mango":
                if (type.equals("small")) {
                    price = 36.66 * 2;
                }
                if (type.equals("big")) {
                    price = 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (type.equals("small")) {
                    price = 42.10 * 2;
                }
                if (type.equals("big")) {
                    price = 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (type.equals("small")) {
                    price = 20 * 2;
                }
                if (type.equals("big")) {
                    price = 15.20 * 5;
                }
                break;
        }
        double total = amount * price;
        if (total >= 400 && total <= 1000) {
            total -= total * 0.15;
            System.out.printf("%.2f lv.", total);
        } else if (total > 1000) {
            total -= total * 0.50;
            System.out.printf("%.2f lv.", total);
        } else {
            System.out.printf("%.2f lv.", total);
        }
    }
}