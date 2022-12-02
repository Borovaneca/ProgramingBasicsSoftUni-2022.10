package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double calcPen = penPackets * 5.80;
        double calcMarker = markerPackets * 7.20;
        double calcDetergent = detergent * 1.20;
        double allMaterials = calcPen + calcMarker + calcDetergent;
        double calcPercent = percent * 0.01;

        double total = allMaterials - (allMaterials * calcPercent);
        System.out.println(total);
    }
}
