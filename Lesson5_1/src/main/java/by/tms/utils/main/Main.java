package by.tms.utils.main;

import by.tms.utils.model.Address;
import by.tms.utils.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Коля";
        person.age = 50;
        person.height = 150;


        Address address = null;
        person.address = address;
        address = new Address();

    }
}
