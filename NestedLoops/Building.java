package NestedLoops;

import java.rmi.server.ObjID;
import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int apartmentsXFloor = Integer.parseInt(scanner.nextLine());
        String office = "O";
        String normal = "A";
        String big = "L";
        int number = 0;

        for (int i = floors; i >= 1; i--) {

            number = 0;
            if (floors == 1) {
                for (int j = 0; j < apartmentsXFloor; j++) {
                    System.out.printf("%s%d%d ", big, i,j);
                    number++;
                }
            } else if (i == floors) {
                for (int j = 0; j < apartmentsXFloor; j++) {
                    System.out.printf("%s%d%d ", big, i, j);
                    number++;
                }
            } else if (i % 2 == 0) {
                for (int j = 0; j < apartmentsXFloor; j++) {
                    System.out.printf("%s%d%d ", office, i, j);
                    number++;
                }
            } else {
                for (int j = 0; j < apartmentsXFloor; j++) {
                    System.out.printf("%s%d%d ", normal, i, j);
                    number++;
                }
            }
            System.out.println("");
        }
    }
}
