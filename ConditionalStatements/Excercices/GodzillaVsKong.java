package ConditionalStatements.Excercices;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = 0.1 * budget;
        double allClothesPrice = statists * clothesPrice;
        if (statists > 150){
            allClothesPrice= allClothesPrice - (allClothesPrice * 0.1);
        }

        double totalSum = allClothesPrice + decor;

        if (totalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        }

    }
}
