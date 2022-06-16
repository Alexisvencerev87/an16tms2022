package by.tms.utils.model;

public class Address {
    //характеристики (свойства, поля)
    public String country;
    public String city;
    public int height;
    public Address address;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", height=" + height +
                ", address=" + address +
                '}';
    }
}
