package patterns.builder;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final double engineSize;

    public Car(String make, String model, int year, String color, double engineSize) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineSize=" + engineSize +
                '}';
    }
}
