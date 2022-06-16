package by.tms.utils.model;

public class Person {
    //характеристики (свойства, поля), глобальная переменная
    public int age;
    public String name;
    public int height;
    public Address address;

    public Person() {    //Конструктор по умолчанию
        //тело
    }

    public void Test() {
        System.out.println("Конструктор для Person");
    }

    public Person(int age, String name, int height, Address address) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
