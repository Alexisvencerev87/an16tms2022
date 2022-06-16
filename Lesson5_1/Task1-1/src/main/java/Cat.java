import org.example.Main;

public class Cat {
    String name;

    public void sayMeow() {
        System.out.println("Miay!");
    }

    public static void main(String[] args) {
        Main barsik = new Main();
        barsik.name = "Basilar";
        barsik.sayMeow();
    }
}
