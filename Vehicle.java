import java.util.Scanner;

class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

 class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the Car:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        System.out.print("Number of Doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine();

        Car car = new Car(carBrand, carSpeed, carDoors);

        System.out.println("Enter details for the Motorcycle:");
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int motorcycleSpeed = scanner.nextInt();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, hasSidecar);

        System.out.println("\nCar Details:");
        car.displayInfo();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();

        scanner.close();
    }
}