package PBMore.ConditionalStatment;

import java.util.Scanner;

public class TankFuel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceGasoline = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;
        double discountGasoline = priceGasoline - 0.18;
        double discountDiesel = priceDiesel - 0.12;
        double discountGas = priceGas - 0.08;
        double sum = 0;

        String type = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        if (type.equals("Gasoline")) {
            if (card.equals("Yes")) {
                sum = quantity * discountGasoline;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (0.08 * sum);
                } else if (quantity > 25) {
                    sum = sum - (0.10 * sum);
                }
            } else if (card.equals("No")) {
                sum = quantity * priceGasoline;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (0.08 * sum);
                } else if (quantity > 25) {
                    sum = sum - (0.10 * sum);
                }
            }
        } else if (type.equals("Diesel")) {
            if (card.equals("Yes")) {
                sum = quantity * discountDiesel;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (0.08 * sum);
                } else if (quantity > 25) {
                    sum = sum - (0.10 * sum);
                }
            } else if (card.equals("No")) {
                sum = quantity * priceDiesel;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (0.08 * sum);
                } else if (quantity > 25) {
                    sum = sum - (0.10 * sum);
                }
            }
        } else if (type.equals("Gas")) {
            if (card.equals("Yes")) {
                sum = quantity * discountGas;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (sum * 0.08);
                } else if (quantity > 25) {
                    sum = sum - (sum * 0.10);
                }
            } else if (card.equals("No")) {
                sum = quantity * priceGas;
                if (quantity >= 20 && 25 >= quantity) {
                    sum = sum - (0.08 * sum);
                } else if (quantity > 25) {
                    sum = sum - (0.10 * sum);
                }
            }
        }
        System.out.printf("%.2f lv.", sum);
    }
}