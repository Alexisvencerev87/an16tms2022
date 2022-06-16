package by.tms.service.Main;

public class User {
    public User(String ivan, String Ivanov, int i, String man) {
    }

    public class Main {
        public static void main(String[] args) {
            User user = new User("Ivan", "Иванов", 23, "мужской");
            System.out.println(user.getFirstLastName());
            user.addAge(10);
            System.out.println(user.getAge());
            System.out.println(user.info());
            System.out.println(user);
        }
    }

    private boolean info() {
        return false;
    }

    private void addAge(int i) {

    }

    private String getFirstLastName() {
        return null;
    }

    private boolean getAge() {
        return false;
    }

}
