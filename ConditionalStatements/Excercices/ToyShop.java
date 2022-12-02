package ConditionalStatements.Excercices;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleOrder = Integer.parseInt(scanner.nextLine());
        int dollOrder = Integer.parseInt(scanner.nextLine());
        int bearOrder = Integer.parseInt(scanner.nextLine());
        int minionOrder = Integer.parseInt(scanner.nextLine());
        int truckOrder = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double totalAmount = (puzzleOrder * puzzlePrice) + (dollOrder * dollPrice) + (bearOrder * bearPrice) + (minionOrder * minionPrice) + (truckOrder * truckPrice);
        int ordersTotal = puzzleOrder + dollOrder + bearOrder + minionOrder + truckOrder;

        if (ordersTotal >= 50) {
            totalAmount = totalAmount - (totalAmount * 0.25);
            // priceWithDiscount = totalAmount * 0.75;
        }
        double rent = totalAmount * 0.10;
        totalAmount = totalAmount - rent;
        double money = totalAmount - tripPrice;

        if (totalAmount >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", money);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(money));

        }


    }
}


