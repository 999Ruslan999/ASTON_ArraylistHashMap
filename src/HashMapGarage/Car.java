package HashMapGarage;

import java.util.Objects;

public abstract class Car {

    // Это класс сущность для Автомобилей, у автомобиля есть Марка, модель, год выпуска, класс,
    // кол-во лошадинных сил, тип топлива.
    // добавил конструктор, геттеры, сеттеры, toString.

    private String make;
    private String model;
    private int yearOfManufacture;
    private String carClass;
    private int LS;
    private String fuelType;


    public Car(String make, String model, int yearOfManufacture, String carClass, int LS, String fuelType) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carClass = carClass;
        this.LS = LS;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getLS() {
        return LS;
    }

    public void setLS(int LS) {
        this.LS = LS;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && LS == car.LS && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(carClass, car.carClass) && Objects.equals(fuelType, car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, yearOfManufacture, carClass, LS, fuelType);
    }

    @Override
    public String toString() {
        return " " +
               "Марка: " + make + '\'' +
               ", Модель: " + model + '\'' +
               ", Год выпуска: " + yearOfManufacture +
               ", Класс: " + carClass + '\'' +
               ", ЛС: " + LS +
               ", Вид топлива: " + fuelType + '\'' +
               '}';
    }
}
