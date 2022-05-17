

public class Task1 {

    public static void main(String[] args) {
        int x = 5; // Введенное число укажет на день недели
        switch (x) {
            case 1:
                System.out.println("Ponedelnik");
                break;
            case 2:
                System.out.println("Vtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Piatnica");
                break;
            case 6:
                System.out.println("Subbota");
                break;
            case 7:
                System.out.println("Voskresenie");
                break;
            default:
                System.out.println("Ne pravilno vvedeno chislo");
                break;
        }
    }
}


