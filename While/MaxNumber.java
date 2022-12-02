package While;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!stop.equals("Stop")){
            int number = Integer.parseInt(stop);
            if (max < number){
                max = number;
            }
            stop = scanner.nextLine();
        }
        System.out.println(max);
    }
}
