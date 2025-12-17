import java.time.LocalDateTime;
import java.util.Scanner;
import exceptions.InvalidLogin;

class Bank{
    private double balance;
    private String ownerName;
    int transactionLimit = 100;
    String[] transaction = new String[transactionLimit];
    static int transactionCount = 0;


    //transaction arrays (from transactions file)

    //---***---
    //---***---
    //---***---
    //---***---
//    transactions t1 = new transactions(1000, 9000, "Debited");

    transactions[] tArr = new transactions[transactionLimit];



    void addTransaction2(String type, double amt, String note){
        transactions t1 = new transactions(amt, balance, type, note);

        if(transactionCount >= transactionLimit){
            System.out.println("Transaction Limit Reached. Increasing Size");
            transactions[] tempArr;

            tempArr = tArr;

            transactionLimit += 50;

            tArr = new transactions[transactionLimit];

            for(int k = 0; k < transactionLimit-50; k++){
                tArr[k] = tempArr[k];
            }


        }

        tArr[transactionCount] = t1;
        transactionCount++;
    }



    void displayTransaction2(){
        for(int i = 0; i <= tArr.length && tArr[i] != null; i++){
            System.out.println(tArr[i].getRecord());
        }
//    System.out.println(tArr);
    }

    void addBal2(double val, String note){
        this.balance += val;
//        System.out.println("Money Added " + val);

        addTransaction2("Credited", val, note);
    }

    void pay2(double val, String note){
        if (balance < val){
            System.out.println("Low balance");
        }else {
            balance -= val;
//            System.out.println("Money Paid " + val);
            addTransaction2("Debited", val, note);
        }
    }

    void filterBy2(String type){
        transactions[] filtered = new transactions[transactionLimit];
        int j = 0;
        System.out.println("\n");

        for(int i = 0; i < transactionCount; i++){
            if(tArr[i].type == type){
                filtered[j] = tArr[i];

                System.out.println(filtered[j].getRecord());

                j++;

            }
        }
    }

    void Login(){
        String definedName = new String();
        definedName = "John";
        int definedPin = 9876;
        Scanner sc = new Scanner(System.in);


        String name;
        int pin;
        boolean check = false;
        for(int i = 0; i < 3 && !check; i++){
            try{
                System.out.print("Enter User Name: ");
                name = sc.nextLine();
                System.out.println();

                if(definedName.equalsIgnoreCase(name)){
                    System.out.print("Enter Pin: ");
                    pin = sc.nextInt();
                    sc.nextLine();

                    if(definedPin == pin){
                        System.out.println("Login Successful!");
                        check = true;
                    }else{
                        throw new InvalidLogin("Wrong Pin");
                    }
                }else {
                    throw new InvalidLogin("Wrong User Name");
                }
            }catch (InvalidLogin e){
                System.out.println(e);
                System.out.println(2-i + " tries remaining");
            }catch (Exception e){
                System.out.println(e);
            }

        }

//        return false;
    }



    //---***---
    //---***---
    //---***---
    //---***---


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
