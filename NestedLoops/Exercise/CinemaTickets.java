package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumAllTickets = 0;
        double student = 0;
        double standard = 0;
        double kid = 0;
        double sumStudent = 0;
        double sumStandard = 0;
        double sumKid = 0;

        while (!input.equals("Finish")){
            int freeSeats = Integer.parseInt(scanner.nextLine());

            student = 0;
            standard = 0;
            kid = 0;
            for (int i = 1; i <= freeSeats; i++) {
                String type = scanner.nextLine();
                switch (type){
                    case "standard":
                        standard++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "End":
                        break;
                }
                if (type.equals("End")){
                    break;
                }
                sumAllTickets++;
            }
            sumStudent += student;
            sumStandard += standard;
            sumKid += kid;

            double sum = ((student + standard + kid) / freeSeats) * 100;

            System.out.printf("%s - %.2f%% full.\n", input, sum);
            input = scanner.nextLine();
        }
        sumStudent = (sumStudent / sumAllTickets) * 100;
        sumStandard = (sumStandard / sumAllTickets) * 100;
        sumKid = (sumKid / sumAllTickets) * 100;
        System.out.printf("Total tickets: %d\n", sumAllTickets);
        System.out.printf("%.2f%% student tickets.\n", sumStudent);
        System.out.printf("%.2f%% standard tickets.\n", sumStandard);
        System.out.printf("%.2f%% kids tickets.", sumKid);
    }
}
