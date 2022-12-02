package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mounts = scanner.nextLine();
        int overnightStays = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (mounts){
            case "May":
            case "October":
                studio = 50;
                apartment = 65;

                if (overnightStays > 7 && overnightStays <= 14) {
                    studio = studio - (studio * 0.05);
                } else if (overnightStays > 14) {
                        studio = studio - (studio * 0.30);
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (overnightStays > 14){
                    studio = studio - (studio * 0.20);
                }break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }
        if (overnightStays > 14){
            apartment = apartment - (apartment * 0.10);
        }
        System.out.printf("Apartment: %.2f lv.%n", overnightStays * apartment);
        System.out.printf("Studio: %.2f lv.%n", overnightStays * studio);
    }
}
