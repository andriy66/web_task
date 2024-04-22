package patterns.builder;

public interface CarBuilder {
    CarBuilder setMake(String make);
    CarBuilder setModel(String model);
    CarBuilder setYear(int year);
    CarBuilder setColor(String color);
    CarBuilder setEngineSize(double engineSize);
    Car build();
}
