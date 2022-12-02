package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();
        int daysTrip = days - 1;
        double onePerson = daysTrip * 18;
        double apartment = daysTrip * 25;
        double president = daysTrip * 35;

        if (roomType.equals("room for one person")){
            if (assessment.equals("positive")){
                onePerson = onePerson + (onePerson * 0.25);
                System.out.printf("%.2f", onePerson);
            } else if (assessment.equals("negative")){
                onePerson = onePerson - (onePerson * 0.1);
                System.out.printf("%.2f", onePerson);
            }
        } else if (roomType.equals("apartment")){
            if (daysTrip < 10){
                apartment = apartment - (apartment * 0.30);
            } else if (daysTrip > 10 && daysTrip < 15){
                apartment = apartment - (apartment * 0.35);
            } else if (daysTrip > 15){
                apartment = apartment - (apartment * 0.50);
            }
            if (assessment.equals("positive")){
                apartment = apartment + (apartment * 0.25);
            } else if (assessment.equals("negative")){
                apartment = apartment - (apartment * 0.1);
            }
            System.out.printf("%.2f", apartment);
        } else if (roomType.equals("president apartment")){
            if (daysTrip < 10){
                president = president - (president * 0.1);
            } else if (daysTrip > 10 && daysTrip < 15){
                president = president - (president * 0.15);
            } else if (daysTrip > 15){
                president = president - (president * 0.2);
            }
            if (assessment.equals("positive")){
                president = president + (president * 0.25);
            } else if (assessment.equals("negative")) {
                president = president - (president * 0.1);
            }
            System.out.printf("%.2f", president);
        }
    }
}
