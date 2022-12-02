package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;

        if (projection.equals("Premiere")){
            income = rows * columns * 12;
        } else if (projection.equals("Normal")){
            income = rows * columns * 7.5;
        } else if (projection.equals("Discount")){
            income = rows * columns * 5;
        }
        System.out.printf("%.2f", income);
    }
}
