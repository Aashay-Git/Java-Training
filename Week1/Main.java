public class Main {
    public static void main(String[] args){
        Bank acc2 = new Bank(15000, "John");

        for(int i = 0; i < 42; i++){
            acc2.pay(5 + (10 + i));
            acc2.addBal(10000 + (100 + i));
        }
//        for(int i = 0; i < 5; i++){
//            acc2.pay(5000);
//            acc2.addBal(10000);
//        }

//        acc2.displayTransaction(10, 3);
//
//        acc2.displayTransaction(10, 8);

        acc2.checkDetails();

        acc2.filterBy("credited");
        acc2.filterBy("debited");

//        acc2.checkDetails();z
    }
}
