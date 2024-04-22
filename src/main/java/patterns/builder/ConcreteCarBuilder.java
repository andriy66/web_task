package patterns.builder;

public class ConcreteCarBuilder implements CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private double engineSize;

    @Override
    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setEngineSize(double engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    @Override
    public Car build() {
        return new Car(make, model, year, color, engineSize);
    }
}
