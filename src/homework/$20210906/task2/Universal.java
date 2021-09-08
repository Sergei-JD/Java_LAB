package homework.$20210906.task2;

public class Universal extends Car {

    public Universal(String brand, String model, int yearOfManufacture, int maxSpeed, String color) {
        super(brand, model, yearOfManufacture, maxSpeed, color);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Universal)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return 23 * super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
