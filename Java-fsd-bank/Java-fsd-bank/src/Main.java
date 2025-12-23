import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void createCar(Scanner sc){
        int speed,doors,noOfSeats;
        String fueltype,engineType,name;


        System.out.println("Enter new car details: ");
        System.out.print("Enter speed of car: ");
        speed =  sc.nextInt();

        System.out.print("Enter no of doors: ");
                doors =  sc.nextInt();
        System.out.print("Enter no of seats: ");
                noOfSeats =  sc.nextInt();
                sc.nextLine();
        System.out.print("Enter the fuel type: ");
            fueltype = sc.nextLine();
        System.out.print("Enter the engine type: ");
        engineType = sc.nextLine();
        System.out.print("Enter the name of car: ");
        name = sc.nextLine();
        Car c1 = new Car(doors,noOfSeats,fueltype,engineType,speed,name);
        c1.start();
        System.out.println(c1.toString());
//        System.out.println("Car Speed: " + c1.getSpeed() );
    }
    public static void createBike(Scanner sc){
        System.out.println("Coming soon....");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Want to create : ");
        System.out.println("1. Bike");
        System.out.println("2. Car");

        switch (sc.nextInt()){
            case 1:
                createBike(sc);
                break;
            case 2:
                createCar(sc);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }









//        wallet wallet1 =  new wallet("Owner1",1008.3);
//        wallet1.addMoney(1000.3,"Amount Credited");
//        wallet1.pay(553,"Amount Debited");
//        for(int i = 0;i <= 16; i++){
//            wallet1.addMoney(10 + i*2,"Amount Credited");
//            wallet1.pay(900 + i*2,"Amount Debited");
//        }
//
//        wallet1.checkBalance();
//        wallet1.fetchTransactions(1,10);
//        wallet1.searchByType("DeBiT");

    }
}