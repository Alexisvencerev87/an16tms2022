public class Cow {

    String name;

    public void sayMyy() {
        System.out.println("myy!");
    }

    public static void main(String[] args) {
        Cow marusia = new Cow();
        marusia.name = "Marusia";

        marusia.sayMyy();
    }
}