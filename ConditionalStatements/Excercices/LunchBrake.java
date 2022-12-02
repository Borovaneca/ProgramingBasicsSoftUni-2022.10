package ConditionalStatements.Excercices;

import java.util.Scanner;

public class LunchBrake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFilm = scanner.nextLine();
        int duringFilm = Integer.parseInt(scanner.nextLine());
        int duringRelaxTime = Integer.parseInt(scanner.nextLine());

        double timeForEat = duringRelaxTime / 8.0;
        double timeForRest = timeForEat / 4.0;

        double timeForWatch = duringRelaxTime - timeForEat - timeForRest;

        if(timeForWatch >= duringFilm){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameFilm, Math.ceil(timeForWatch - duringFilm));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameFilm, Math.ceil(duringFilm - timeForWatch));
        }
    }
}
