    package NestedLoops;

    import java.util.Scanner;

    public class SumOfTwoNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int start = Integer.parseInt(scanner.nextLine());
            int end = Integer.parseInt(scanner.nextLine());
            int magic = Integer.parseInt(scanner.nextLine());
            int count = 1;
            boolean stop = false;

            for (int i = start; i <= end ; i++) {
                for (int j = start; j <= end ; j++) {
                    if (i + j == magic){
                        System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                        stop = true;
                        break;
                    } else if (i == end && j == end){
                        System.out.printf("%d combinations - neither equals %d", count, magic);
                    }
                    count++;
                }
                if (stop){
                    break;
                }
            }
        }
    }
