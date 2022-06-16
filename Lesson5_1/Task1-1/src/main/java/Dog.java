public class Dog {

    String name;

    public void sayGaw() {
        System.out.println("Gaw!");
    }

    public static void main(String[] args) {
        Dog bobik = new Dog();
        bobik.name = "Bobik";
        bobik.sayGaw();
    }
}

