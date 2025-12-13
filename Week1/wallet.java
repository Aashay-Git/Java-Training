import java.time.LocalDateTime;

class Bank{
    private double balance;
    private String ownerName;
    int transactionLimit = 100;
    String[] transaction = new String[transactionLimit];
    int transactionCount = 0;

    Bank(double balance, String ownerName){
        this.balance = balance;
        this.ownerName = ownerName;
    }

    void checkBal(){
        System.out.println("THe balance is: " + balance);
    }
    void addBal(double val){
        this.balance += val;
//        System.out.println("Money Added " + val);
        addTransaction("credited \t| " + val);
    }
    void pay(double val){
        if (balance < val){
            System.out.println("Low balance");
        }else {
            balance -= val;
//            System.out.println("Money Paid " + val);
            addTransaction("debited \t| " + val);
        }
    }

    void addTransaction(String op){

        if(transactionCount >= transactionLimit){
            System.out.println("Transaction Limit Reached. Increasing Size");
            String[] tempArr;

            tempArr = transaction;

            transactionLimit += 50;

            this.transaction = new String[transactionLimit];

            for(int k = 0; k < transactionLimit-50; k++){
               transaction[k] = tempArr[k];
            }



//            return;


        }

        transaction[transactionCount] = LocalDateTime.now() + " \t| " + op;
        transactionCount++;
    }

    void displayTransaction(int limit, int page){
        int temp = limit * (page-1);

        if(temp > transactionCount){
            System.out.println("\nPage " + page + " Out of bounds\n");
            return;
        }

        for(int i = temp;i < transactionCount && i < temp+limit; i++){
            System.out.println(transaction[i]);
        }
    }
    void checkDetails(){
        System.out.println("Name: " + ownerName);
        System.out.println("Num of Transaction: " + transactionCount);
        System.out.println("Balance: " + balance);
    }



    void filterBy(String type){
        String[] filtered = new String[transactionLimit];
        int j = 0;
        System.out.println("\n");

        for(int i = 0; i < transactionCount; i++){
            if(transaction[i].contains(type)){
                filtered[j] = transaction[i];

                System.out.println(filtered[j]);

                j++;

            }
        }
    }
}















//public class wallet {
//    public static void main(String[] args){
//        Bank acc = new Bank(10000, "John");
//
//        acc.checkBal();
//
//        acc.pay(8000);
//
//        acc.addBal(1000);
//
//        acc.pay(8000);
//
//        acc.addBal(10000);
//
//        acc.pay(8000);
//
//        acc.addBal(1000);
//
//        acc.displayTransaction();
//
//        acc.checkNumTransaction();
//    }
//}
