public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Mercedes");
        car.setModel("AMG G 63");
        car.setColor("Obsidian Black Metallic");
        car.setDoors(4);
        car.setConvertible(false);
        car.describeCar();

        Car porsche = new Car();
        porsche.setMake("Porsche");
        porsche.setColor("911");
        porsche.setModel("Piano Black");
        porsche.setDoors(2);
        porsche.setConvertible(true);
        porsche.describeCar();
    }

}
