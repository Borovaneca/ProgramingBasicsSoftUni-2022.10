package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int prime = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int string = Integer.parseInt(input);
            if (string < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int countNum = 1;
            for (int i = 2; i <= string ; i++) {
                if (string % i == 0){
                    countNum++;
                }
                if (countNum == 3){
                    break;
                }
            }
            if (countNum > 2){
                nonPrime += string;
            } else {
                prime += string;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }
}
