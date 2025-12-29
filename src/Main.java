public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Bakytzhan", "020KTL20");
        Driver driver2 = new Driver("Amir", "777SEM04");
        Driver driver3 = new Driver("Assan", "001BIR01");
        Driver driver4 = new Driver("Rus", "None");
        Driver driver5 = new Driver("Hamid", "AFG 001");

        Vehicle car1 = new Car("Lexus LFA", 2016, driver1, 2, "Petrol");
        Vehicle car2 = new Car("Bugatti Veyron", 2025, driver2, 2, "Petrol");

        Vehicle motorcycle1 = new Motorcycle("Suzuki", 2024, driver3, 2, "97");

        Vehicle truck1 = new Truck("Lamborghini Trattori", 1948, 5000, 4, driver5);

        Vehicle[] vehicles = {car1, car2, motorcycle1, truck1};

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(i+1 + " person: ");
            System.out.println("Vehicle #" + (i + 1));
            vehicles[i].startEngine();
            vehicles[i].displayDriver();
            vehicles[i].displayInfo();
            vehicles[i].stopEngine();
            System.out.println('\n');
        }
    }
}