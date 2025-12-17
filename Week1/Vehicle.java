public class Vehicle {
    private int nOfWheels;
    private int maxSpeed;
    private String fuelType;
    private String engineType;
    private String name;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getnOfWheels() {
        return nOfWheels;
    }

    public void setnOfWheels(int nOfWheels) {
        this.nOfWheels = nOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(int nOfWheels, int maxSpeed, String fuelType, String engineType) {
        this.nOfWheels = nOfWheels;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.engineType = engineType;
    }

    private void start(String vName) {
        System.out.println(vName + " has started");
    }

    void details() {
        System.out.println("Speed " + maxSpeed);
    }

    void callPrivMethod(String vName){
        start(vName);
    }
}

class car extends Vehicle {
    int doors = 4;
    int nOfSeats;

    public car(int nOfWheels, int maxSpeed, String fuelType, String engineType, int doors, int nOfSeats) {
        super(nOfWheels, maxSpeed, fuelType, engineType);
        this.doors = doors;
        this.nOfSeats = nOfSeats;
    }

    void callPrivMethod(){
        System.out.println("testing");
    }

    void start(){
        super.callPrivMethod("Car");
    }

    void display(){
        System.out.println(getnOfWheels() + " " + getMaxSpeed() + " " + getFuelType() + " " + getEngineType() + " " + doors + " " + nOfSeats);
    }

}

class bike extends Vehicle {
    String bikeType;

    public bike(String bikeType, int nOfWheels, int maxSpeed, String fuelType, String engineType) {
        super(nOfWheels, maxSpeed, fuelType, engineType);
        this.bikeType = bikeType;
    }

    void speedUpdate(int newSpeed) {
        setMaxSpeed(newSpeed);
    }

    void start(){
        super.callPrivMethod("Bike");
    }

    void display(){
        System.out.println(bikeType + " " + getnOfWheels() + " " + getMaxSpeed() + " " + getFuelType() + " " + getEngineType());
    }

}