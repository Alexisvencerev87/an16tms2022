import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vvidite kolichestvo chasov: ");
        int x = scan.nextInt();
        int res = 1;
        for (int i = 0; i < x / 3; i++) {
            res *= 2;
        }
        System.out.printf("Za %d chasov polychitsia %d ameb.", x, res);
    }
}
