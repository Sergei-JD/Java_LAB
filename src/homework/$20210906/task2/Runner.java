package homework.$20210906.task2;

public class Runner {

    public static void main(String[] args) {
        Car truck = new Truck("Volvo", "FH", 2019, 180, "white");
        Car minivan = new Minivan("Renault", "scenic", 2017, 250, "burgundy");
        Car universal = new Universal("Audi", "rs6", 2020, 300, "black");
        Car sedan = new Sedan("Lada", "2115", 2007, 110, "purple");

        Garage garage = new Garage();

        garage.park(truck);
        garage.park(truck);
        garage.park(minivan);
        garage.park(universal);
        garage.park(sedan);
        garage.park(minivan);
        garage.park(minivan);
        System.out.println();

        garage.printAllCars();
        System.out.println();

        garage.unPark(truck);
        System.out.println();

        garage.printAllCars();

        garage.carByBrandCount("Volvo");
    }

}
