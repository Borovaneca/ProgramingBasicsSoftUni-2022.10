package FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogPacks = Integer.parseInt(scanner.nextLine());
        int catPacks = Integer.parseInt(scanner.nextLine());

        double calcDogs = dogPacks * 2.50;
        double calcCats = catPacks * 4.0;
        double total = calcDogs + calcCats;

        System.out.println(total);

    }
}
