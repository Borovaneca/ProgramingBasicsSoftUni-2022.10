package PBMore.PBExams;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double kilograms = Double.parseDouble(input);
        double amount = kilograms * 1000;
        int dailyEat = 0;
        double sumGrams = 0;
        int count = 0;

        while (!input.equals("Adopted")){
            count++;
            if (count > 1){
                dailyEat = Integer.parseInt(input);
            } else {
                dailyEat = Integer.parseInt(scanner.nextLine());
            }
            sumGrams += dailyEat;

            input = scanner.nextLine();
        }
        if (sumGrams <= amount){
            System.out.printf("Food is enough! Leftovers: %.0f grams.", amount - sumGrams);
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.", sumGrams - amount);
        }
    }
}
