package PBMore.PBExams;

import java.util.Scanner;

public class NumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String input = "";
        boolean wars = false;
        int player1 = 0;
        int player2 = 0;
        int player1Points = 0;
        int player2Points = 0;
        int count = 0;

        while (!input.equals("End of game")){
            count++;
            if (count > 1){
                player1 = Integer.parseInt(input);
            } else {
                player1 = Integer.parseInt(scanner.nextLine());
            }
                player2 = Integer.parseInt(scanner.nextLine());
            if (player1 == player2){
                wars = true;
                break;
            } else if (player1 > player2){
                player1Points += player1 - player2;
            } else {
                player2Points += player2 - player1;
            }

            input = scanner.nextLine();
        }
        if (wars){
            System.out.println("Number wars!");
            player1 = Integer.parseInt(scanner.nextLine());
            player2 = Integer.parseInt(scanner.nextLine());
            if (player1 > player2){
                System.out.printf("%s is winner with %d points\n", name1, player1Points);
            } else {
                System.out.printf("%s is winner with %d points", name2, player2Points);
            }
        } else {
            System.out.printf("%s has %d points\n", name1, player1Points);
            System.out.printf("%s has %d points", name2, player2Points);

        }
    }
}
