package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
                // Roza = 5; Daliq = 3.8; Lale = 2.8; Narcis = 3; Gladiola = 2.5;
        double price = 0;
        double sum = 0 * price;

        if (flowers.equals("Roses")){
            price = 5;
            sum = numberFlowers * price;
            if (numberFlowers > 80){
                sum = sum - (0.10 * sum);
            }
        } else if (flowers.equals("Dahlias")) {
            price = 3.8;
            sum = numberFlowers * price;
            if (numberFlowers > 90){
                sum = sum - (0.15 * sum);
            }
        } else if (flowers.equals("Tulips")){
            price = 2.8;
            sum = numberFlowers * price;
            if (numberFlowers > 80){
                sum = sum - (0.15 * sum);
            }
        } else if (flowers.equals("Narcissus")){
            price = 3;
            sum = numberFlowers * price;
            if (numberFlowers < 120){
                sum = sum + (0.15 * sum);
            }
        } else if (flowers.equals("Gladiolus")){
            price = 2.5;
            sum = numberFlowers * price;
            if (numberFlowers < 80){
                sum = sum + (0.20 * sum);
            }
        }
        if (budget >= sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flowers, budget - sum);
        } else  {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(sum - budget));
        }
    }
}
