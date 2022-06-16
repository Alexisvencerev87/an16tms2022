import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(28800 + 1);
        int b = a / 60 / 60;
        System.out.println("Sekynd ostalos " + a);
        switch (b) {
            case 0:
                System.out.println("Do konca rabochego dnia ostalos menshe chasa");
                break;
            case 1:
                System.out.println("Do konca rabochego dnia ostalsia " + b + " chas");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Do konca rabochego dnia ostalos " + b + " chasa");
                break;
            default:
                System.out.println("Do konca rabochego dnia ostalos " + b + " chasov");
        }
    }
}

