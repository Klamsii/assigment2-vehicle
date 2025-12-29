public class Truck extends Vehicle {
    protected double capacity;
    protected int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles, Driver driver) {
        super(brand, year, driver);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }
}
