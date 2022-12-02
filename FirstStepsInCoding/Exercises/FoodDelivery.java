package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Desert = 20% ot obshtata smetka
        // Dostavka = 2.50 i se dobavq nai-nakraq dori i sled deserta.

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double calcChicken = chickenMenu * 10.35;
        double calcFish = fishMenu * 12.40;
        double calcVegetarian = vegetarianMenu * 8.15;
        double allMenus = calcChicken + calcFish + calcVegetarian;
        double desert = allMenus * 0.2;
        double delivery = 2.50;
        double total = allMenus + desert + delivery;

        System.out.println(total);
    }
}
