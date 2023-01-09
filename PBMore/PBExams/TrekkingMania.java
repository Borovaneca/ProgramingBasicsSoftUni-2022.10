package PBMore.PBExams;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int groups = Integer.parseInt(scanner.nextLine());
        int people = 0;
        double musala = 0;
        double monblan = 0;
        double kalimadjaro = 0;
        double k2 = 0;
        double everest = 0;
        double sumPeople = 0;

        for (int i = 1; i <= groups; i++) {
            people = Integer.parseInt(scanner.nextLine());
            sumPeople += people;
                if (people <= 5){
                    musala += people;
                } else if (people <= 12){
                    monblan += people;
                } else if (people <= 25){
                    kalimadjaro += people;
                } else if (people <= 40){
                    k2 += people;
                } else {
                    everest += people;
                }
        }
        musala = musala / sumPeople * 100;
        monblan = monblan / sumPeople * 100;
        kalimadjaro = kalimadjaro / sumPeople * 100;
        k2 = k2 / sumPeople * 100;
        everest = everest / sumPeople * 100;

        System.out.printf("%.2f%%\n", musala);
        System.out.printf("%.2f%%\n", monblan);
        System.out.printf("%.2f%%\n", kalimadjaro);
        System.out.printf("%.2f%%\n", k2);
        System.out.printf("%.2f%%", everest);
    }
}
