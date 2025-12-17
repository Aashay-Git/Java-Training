import java.util.Scanner;

public class mainVehicle {
    public static void main(String[] args) {
        mainVehicle v = new mainVehicle();

        Scanner sc = new Scanner(System.in);

        int choice = v.choice();

        switch (choice) {
            case 1:
                v.createBike();
                break;

            case 2:
                v.createCar();
                break;

            default:
                System.out.println("Error in selection. Retry");
                v.choice();
        }
    }

    void createCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details: ");
        System.out.print("num of wheels: ");
        int wheels = sc.nextInt();
        System.out.print("max speed: ");
        int speed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String ftype = sc.nextLine();
        System.out.print("Engine Type: ");
        String etype = sc.nextLine();
        System.out.print("num of doors: ");
        int doors = sc.nextInt();
        System.out.print("num of seats: ");
        int seats = sc.nextInt();

        car c1 = new car(wheels, speed, ftype, etype, doors, seats);

        c1.display();

        System.out.println("Start vehicle(Y/N): ");
        sc.nextLine();
        String schoice = sc.nextLine();

        if (schoice.equals("Y")) {
            c1.start();
        }

    }

    void createBike(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details: ");
        System.out.print("Type: ");
        String type = sc.nextLine();
        System.out.print("num of wheels: ");
        int wheels = sc.nextInt();
        System.out.print("max speed: ");
        int speed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String ftype = sc.nextLine();
        System.out.print("Engine Type: ");
        String etype = sc.nextLine();

        bike b1 = new bike(type, wheels, speed, ftype, etype);

        b1.display();

        System.out.println("Start vehicle(Y/N): ");
        sc.nextLine();
        String schoice = sc.nextLine();

        if (schoice.charAt(0) == 'Y') {
            b1.start();
        }else{
            System.out.println("Vehicle Not started");
        }
    }

    int choice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose vehicle to create: ");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        return sc.nextInt();
    }
}
