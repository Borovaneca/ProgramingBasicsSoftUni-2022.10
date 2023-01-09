package PBMore.WhileLoop;

import java.util.Scanner;

public class ChristmasThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String space = " ";
        String vertical = " | ";
        String star = "*";

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.println();
            }

            if (i == 0 || i != 0){
                for (int j = 1; j <= n; j++) {
                    System.out.print(space);
                }
            }
            if (i == 0){
                System.out.printf("%s", vertical);
                continue;
            }
            if (i > 0){
                for (int j = 1; j <= i; j++) {
                    if ( j >= i){
                        System.out.print(star);
                    } else {
                        System.out.print(vertical);
                    }
                }
            }
        }
    }
}
