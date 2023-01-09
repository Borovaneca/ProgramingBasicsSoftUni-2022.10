package PBMore.PBExams;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yens = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());


        double oneBitcoin = 1168; // лева
        double oneYen = 0.15; // dollars
        double oneDollar = 1.76; // лева
        double oneEuro = 1.95; // лева

        double calcBitcoins = bitcoins * oneBitcoin;
        double calcYens = yens * oneYen;
        double calc = calcYens * oneDollar;
        double calcEuro = (calcBitcoins + calc) / oneEuro;
        double calcTax = commission / 100.0;
        double total = calcEuro - (calcEuro *calcTax);
        System.out.printf("%.2f", total);

    }
}
