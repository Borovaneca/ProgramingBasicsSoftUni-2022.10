package NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1111; i <= 9999; i++) {

            int firstNum = i / 1000 % 10;
            int secondNum = i / 100 % 10;
            int thirdNum = i / 10 % 10;
            int fourthNum = i % 10;


            boolean first = n % firstNum == 0;
            boolean second = secondNum != 0 && n % secondNum == 0;
            boolean third = thirdNum != 0 && n % thirdNum == 0;
            boolean fourth = fourthNum != 0 && n % fourthNum == 0;

            if (first && second && third && fourth){
                System.out.print(i + " ");
            }
        }
    }
}