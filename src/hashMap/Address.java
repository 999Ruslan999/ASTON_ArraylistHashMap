package hashMap;


import java.util.Objects;

// Это класс (сущность) для создания адрессов.
// В классе есть два поля - Страна и Город, так же создал конструктор и методы equals, hashCode, toString.
public class Address {

    private String country;

    private String city;


    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(country, address.country) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public String toString() {
        return "Address{" +
               "country='" + country + '\'' +
               ", city='" + city + '\'' +
               '}';
    }
}
