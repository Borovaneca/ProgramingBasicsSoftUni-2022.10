package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kecove = -%40 ot godina
        // ekip = -%20 ot kecove
        // topka = - 1/4 ot ekip
        // aksesoari = 1/5 ot topka

        int year = Integer.parseInt(scanner.nextLine());

        double sneakers = year - (0.4 * year);
        double equip = sneakers - (0.2 * sneakers);
        double ball = equip / 4;
        double accessories = ball / 5;
        double total = year + sneakers + equip + ball + accessories;

        System.out.println(total);
    }
}
