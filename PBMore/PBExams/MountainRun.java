package PBMore.PBExams;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePerOneMin = Double.parseDouble(scanner.nextLine());

        double calcDistance = distanceInMeters * timePerOneMin;
        double calcDelay = Math.floor((distanceInMeters / 50)) * 30;
        double total = calcDistance + calcDelay;
        double all = Math.abs(total - record);
        if (total < record){
            System.out.printf("Yes! The new record is %.2f seconds.", total);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", all);
        }
    }
}
