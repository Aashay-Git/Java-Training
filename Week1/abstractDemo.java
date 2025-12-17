abstract class abstractclass{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle Needs Fuel");
    }
}

class absCar extends abstractclass{
    void start(){
        System.out.println("test");
    }
}

public class abstractDemo {
    public static void main(String[] args){
        absCar ab = new absCar();

        ab.start();
        ab.fuel();


        abstractclass a1 = new abstractclass() {
            @Override
            void start() {
                System.out.println("abst obj");
            }
        };

        a1.start();
        a1.fuel();
    }
}