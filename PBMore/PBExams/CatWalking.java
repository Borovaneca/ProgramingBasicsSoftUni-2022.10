package PBMore.PBExams;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int dailyWalks = Integer.parseInt(scanner.nextLine());
        int amountOfCalories = Integer.parseInt(scanner.nextLine());
        int calories = amountOfCalories / 2;
        int burnedCalories = 0;
        int daysCount = 1;
        int dailyMin = 1;
        boolean stop = false;

        while (daysCount <= dailyWalks){
            dailyMin = 1;
            while (dailyMin <= minutesPerWalk){
                burnedCalories += 5;
                if (burnedCalories >= calories) {
                    stop = true;
                }
                dailyMin++;
            }
            daysCount++;
        }
        if (stop){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
