package PBMore.ConditionalStatment;

import java.util.Scanner;

public class SleepyCatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int sumDays = 365 - freeDays;
        int workingDaysInMinutes = sumDays * 63;
        int freeDaysInMinutes = freeDays * 127;
        int sumMinutes = workingDaysInMinutes + freeDaysInMinutes;
        int neededMinutes = 30000;
        int minutesDifference = Math.abs(neededMinutes - sumMinutes);
        int hours = minutesDifference / 60;
        int minutes = minutesDifference % 60;

        if (sumMinutes < neededMinutes){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }


    }
}
