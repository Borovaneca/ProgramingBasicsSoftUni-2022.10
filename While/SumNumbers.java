package While;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int number = 0;
        while (!(number >= num)){
            int numIn = Integer.parseInt(scanner.nextLine());
            number += numIn;
        }
        System.out.printf("%d", number);
    }
}
