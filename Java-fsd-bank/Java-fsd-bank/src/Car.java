public class Car extends Vehicle {
    int doors = 4;
    int noOfSeats;

    @Override
    public String toString() {
        return super.getName() + "{" +
                "doors=" + doors +
                ", noOfSeats=" + noOfSeats +
                ", speed=" + super.getSpeed() +
                ", No Of Wheels " + super.getNoOfWheels() +
                ",Engine type " + super.getEngineType() +
                ", Fuel Type  " + super.getFuelType() +

                '}';
    }

    public Car(int doors, int noOfSeats, String fuelType, String engineType, int speed, String name) {
        super(4,speed,fuelType,engineType);
        this.doors = doors;
        this.noOfSeats = noOfSeats;
        super.setName(name);
    }
}
