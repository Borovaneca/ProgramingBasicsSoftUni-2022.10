package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        if (name.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            System.out.println(side * side);
        } else if (name.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.println(side1 * side2);
        } else if (name.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.PI * (radius * radius));
        } else if (name.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double ling = Double.parseDouble(scanner.nextLine());
            System.out.println(side * ling / 2);
            
        }
    }
}
