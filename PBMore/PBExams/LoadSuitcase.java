package PBMore.PBExams;

import java.util.Scanner;

public class LoadSuitcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = "";
        double capacity = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double suitcase = 0;
        double volume = 0;
        boolean full = false;
        int suitcaseLoaded = 0;

        while (!input.equals("End")) {
            count++;
            if (count > 1) {
                suitcase = Double.parseDouble(input);
            } else {
                suitcase = Double.parseDouble(scanner.nextLine());
            }
            if (count % 3 == 0){
                suitcase += suitcase * 0.10;
            }

            volume += suitcase;
            if (volume > capacity) {
                full = true;
                break;
            }
            suitcaseLoaded++;
            input = scanner.nextLine();
        }
        if (full) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcaseLoaded);
    }
}
