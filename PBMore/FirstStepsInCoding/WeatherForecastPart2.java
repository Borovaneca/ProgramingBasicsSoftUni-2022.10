package PBMore.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grades = Double.parseDouble(scanner.nextLine());

        if (grades >= 26 && grades <= 35){
            System.out.println("Hot");
        } else if (grades >= 20.1 && grades <= 25.9) {
            System.out.println("Warm");
        } else if (grades >= 15 && grades <= 20) {
            System.out.println("Mild");
        } else if (grades >= 12 && grades <= 14.9) {
            System.out.println("Cool");
        } else if (grades >= 5 && grades <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
