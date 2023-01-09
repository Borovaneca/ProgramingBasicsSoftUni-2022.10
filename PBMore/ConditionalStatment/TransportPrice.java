package PBMore.ConditionalStatment;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double taxi = 0;
        double pullman = 0;
        double train = 0;
        double totalSum = 0;

        if (distance >= 20 && distance < 100){
            pullman = 0.09;
            totalSum = distance * pullman;
            System.out.printf("%.2f", totalSum);
        } else if (distance >= 100){
            train = 0.06;
            totalSum = distance * train;
            System.out.printf("%.2f", totalSum);
        } else if ( dayTime.equals("day")){
            taxi = 0.79;
            totalSum = distance * taxi + 0.70;
            System.out.printf("%.2f", totalSum);
        } else if (dayTime.equals("night")){
            taxi = 0.90;
            totalSum = distance * taxi + 0.70;
            System.out.printf("%.2f", totalSum);
        }

    }
}
