package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.equals("banana") || name.equals("apple") || name.equals("cherry") || name.equals("kiwi") || name.equals("lemon") || name.equals("grapes")){
            System.out.println("fruit");
        } else if (name.equals("tomato") || name.equals("cucumber") || name.equals("pepper") || name.equals("carrot")){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
