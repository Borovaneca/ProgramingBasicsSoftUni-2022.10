package PBMore.PBExams;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        char sex = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;

        switch (sport){
            case "Gym":
                if (sex == 'm'){
                    price = 42;
                    break;
                }
                if (sex == 'f'){
                    price = 35;
                    break;
                }
            case "Boxing":
                if (sex == 'm'){
                    price = 41;
                    break;
                }
                if (sex == 'f'){
                    price = 37;
                    break;
                }
            case "Yoga":
                if (sex == 'm'){
                    price = 45;
                    break;
                }
                if (sex == 'f'){
                    price = 42;
                    break;
                }
            case "Zumba":
                if (sex == 'm'){
                    price = 34;
                    break;
                }
                if (sex == 'f'){
                    price = 31;
                    break;
                }
            case "Dances":
                if (sex == 'm'){
                    price = 51;
                    break;
                }
                if (sex == 'f'){
                    price = 53;
                    break;
                }
            case "Pilates":
                if (sex == 'm'){
                    price = 39;
                    break;
                }
                if (sex == 'f'){
                    price = 37;
                    break;
                }
        }
        if (age <= 19){
            price -= price * 0.20;
        }
        if (currentMoney >= price){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - currentMoney);
        }
    }
}
