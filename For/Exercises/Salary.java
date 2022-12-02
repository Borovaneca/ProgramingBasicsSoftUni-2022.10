    package For.Exercises;

    import java.util.Scanner;

    public class Salary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Facebook = 150;
            // Instagram = 100;
            // Reddit = 50;

            int openTabs = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= openTabs; ++i) {
                String nameSite = scanner.nextLine();

                if (nameSite.equals("Facebook")){
                    salary -= 150;
                } else if (nameSite.equals("Instagram")){
                    salary -= 100;
                } else if (nameSite.equals("Reddit")){
                    salary -= 50;
                }
                if (salary <= 0){
                    System.out.println("You have lost your salary.");
                    break;
                }
            } if (salary > 0) {
                System.out.println(salary);
            }
        }
        }
