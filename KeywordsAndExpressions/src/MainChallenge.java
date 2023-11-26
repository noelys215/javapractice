public class MainChallenge {
    public static void main(String[] args) {
        Car car = new Car("2023 Porsche Dakar");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Red Ferrari 296 GTS", 15.4, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2024 Tesla CyberTruck", 568, 75);
        runRace(tesla);

        Car prius = new HybridCar("2024 Prius Outback", 16, 8, 8);
        runRace(prius);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
