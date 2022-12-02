package For;

public class OneTo100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i < 100) {
                System.out.printf("%d,", i);
            } else {
                System.out.printf("%d.", i);
            }
        }
    }
}
