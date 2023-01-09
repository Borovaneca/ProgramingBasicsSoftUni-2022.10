package PBMore.FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prizeSkumria = Double.parseDouble(scanner.nextLine());
        double prizeCaca = Double.parseDouble(scanner.nextLine());
        double palamudKilos = Double.parseDouble(scanner.nextLine());
        double safridKilos = Double.parseDouble(scanner.nextLine());
        int midiPrize = Integer.parseInt(scanner.nextLine());
        double palamudaWeightPrize = palamudKilos * (prizeSkumria + (0.6 * prizeSkumria));
        double safridWeightPrize = safridKilos * (prizeCaca + (0.8 * prizeCaca));
        double midiWeightPrize = midiPrize * 7.5;

        double total = palamudaWeightPrize + safridWeightPrize + midiWeightPrize;
        System.out.printf("%.2f", total);
    }
    }
