import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 0;
        int a = 0;
        int b = 0;
        System.out.print("Vvedite chislo: ");
        i = sc.nextInt();
        System.out.println("Vveddite vtoroe chislo: ");
        a = sc.nextInt();
        System.out.println("Vvedite tretie chislo: ");
        b = sc.nextInt();
        if ((Math.abs(i)) < (Math.abs(a)) && (Math.abs(i)) < (Math.abs(b))) {
            System.out.println(Math.abs(i));
        } else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
            System.out.println(Math.abs(a));
        } else {
            System.out.println(Math.abs(b));
        }
    }
}

