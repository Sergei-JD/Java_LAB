package homework.$20210906.task2;

public class Sedan extends Car {

    public Sedan(String brand, String model, int yearOfManufacture, int maxSpeed, String color) {
        super(brand, model, yearOfManufacture, maxSpeed, color);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sedan)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return 24 * super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
