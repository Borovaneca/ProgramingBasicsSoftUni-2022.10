package PBMore.FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wToCm = 100 * w;
        double hToCm = 100 * h;

        int valueW = (int)wToCm;
        int valueH = (int)hToCm;

        int wToColons = valueW / 120; // 12.5
        int hToSeats = (valueH - 100) / 70; // 11.28

        double hPerW = hToSeats * wToColons; // 141
        double total = hPerW - 3; // 139

        System.out.printf("%.0f", total);

    }
}
