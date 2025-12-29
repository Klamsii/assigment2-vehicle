public class Motorcycle extends Vehicle {
    private int wheels;
    private String fuelType;

    public Motorcycle(String brand, int year, Driver driver, int wheels, String fuelType) {
        super(brand, year, driver);
        this.wheels = wheels;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}
