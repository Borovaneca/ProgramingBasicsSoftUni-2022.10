package PBMore.PBExams;

import java.util.Scanner;

public class TournamentOFChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String input = "";
        String name = "";
        String winOrLose = "";
        double winedMoney = 0;
        int win = 0;
        int lose = 0;
        int count = 0;
        double money = 0;
        int winedDays = 0;
        int lostDays = 0;
        double wontSum = 0;

        for (int i = 1; i <=days; i++) {

            win = 0;
            lose = 0;
            money = 0;
            while (!input.equals("Finish")) {
                count++;
                if (count > 1) {
                    name = input;
                } else {
                    name = scanner.nextLine();
                }
                winOrLose = scanner.nextLine();
                switch (winOrLose) {
                    case "win":
                        win++;
                        money += 20;
                        break;
                    case "lose":
                        lose++;
                        break;
                }

                input = scanner.nextLine();
            }

            if (win > lose){
                money += money * 0.10;
                winedDays++;
                wontSum += money;
            } else {
                lostDays++;
                wontSum += money;
            }
            if (i == days){
                break;
            }
            input = scanner.nextLine();
        }
        if (winedDays > lostDays){
            wontSum += wontSum * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", wontSum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", wontSum);
        }
    }
}