package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double priceRent = 0;

        switch (season){
            case "Spring":
                priceRent = 3000;
                break;
            case "Summer":
                priceRent = 4200;
            case "Autumn":
                priceRent = 4200;
                break;
            case "Winter":
                priceRent = 2600;
                break;
            default:
                break;
        }
        if (fishermen <= 6){
            priceRent = priceRent - (priceRent * 0.1);
        } else if (fishermen <= 11){
            priceRent = priceRent - (priceRent * 0.15);// 3.570
        } else if (fishermen > 12){
            priceRent = priceRent - (priceRent * 0.25);
        }

        if (season.equals("Spring") && fishermen % 2 == 0){
            priceRent = priceRent - (priceRent * 0.05);
        } else if (season.equals("Summer") && fishermen % 2 == 0){
            priceRent = priceRent - (priceRent * 0.05);
        } else if (season.equals("Winter") & fishermen % 2 == 0){
            priceRent = priceRent - (priceRent * 0.05);
        }
        double total = Math.abs(budget - priceRent);
        if (budget >= priceRent){
            System.out.printf("Yes! You have %.2f leva left.", total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", total);
        }

        }
    }
