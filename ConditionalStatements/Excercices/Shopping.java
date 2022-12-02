package ConditionalStatements.Excercices;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumGpu = gpu * 250;
        double prizeCpu = 0.35 * sumGpu;
        double sumCpu = cpu * prizeCpu;
        double prizeRam = sumGpu * 0.1;
        double sumRam = ram * prizeRam;
        double sumPrizes = sumGpu + sumCpu + sumRam;

        if (gpu > cpu){
            sumPrizes = sumPrizes * 0.85;
        }
        if (sumPrizes <= budget){
            System.out.printf("You have %.2f leva left!", budget - sumPrizes);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sumPrizes - budget);
        }
    }
}
