package homework.$20210906.task2;

import java.util.Objects;

public abstract class Car {

    private final String brand;
    private final String model;
    private final int yearOfManufacture;
    private final int maxSpeed;
    private final String color;

    public Car(String brand, String model, int yearOfManufacture, int maxSpeed, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && maxSpeed == car.maxSpeed && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufacture, maxSpeed, color);
    }

    @Override
    public String toString() {
        return "автомобиль {" +
                "бренда-" + brand  +
                ", модели-" + model +
                ", " + yearOfManufacture + "-года выпуска" +
                ", с максимальной скоростью-" + maxSpeed + " км/ч" +
                ", цвета-" + color +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

}
