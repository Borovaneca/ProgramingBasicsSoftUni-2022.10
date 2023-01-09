package PBMore.ConditionalStatment;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double missedHours = Double.parseDouble(scanner.nextLine());

        double sumLiters = missedHours * (pipe1 + pipe2);
        double pipesPercent = sumLiters / volume * 100;
        double pipe1Percent = pipe1 * missedHours / sumLiters * 100;
        double pipe2Percent = pipe2 * missedHours / sumLiters * 100;
        double diff = Math.abs(sumLiters - volume);

        if (sumLiters <= volume){
            System.out.printf("The pool is %2.2f%% full. Pipe 1: %2.2f%%. Pipe 2: %.2f%%.", pipesPercent, pipe1Percent, pipe2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", missedHours, diff);
        }

    }
}
