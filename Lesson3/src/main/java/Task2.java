import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Vvedite celoe chislo:");
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Cetnoe");
            } else {
                System.out.println("Ne cetnoe");
            }
        } catch (Exception e) {
            System.out.println("Mistake!");
        }
    }


}
