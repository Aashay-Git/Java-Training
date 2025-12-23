import java.time.LocalDateTime;
import java.util.Arrays;

public class wallet {
    private String name;

    public wallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public wallet(String name){
        this.name = name;
        balance = 0.0;
    }

    private double balance;
    //String TIme of transaction + operation type + amount;
    private int transactionSize = 100;
    //Size will be increase by transactionSize / 2;
    private Transaction[] transactions = new Transaction[transactionSize];
    private int transactionCount = 0;
    public void checkBalance(){
        System.out.println("Current Balance "+ balance );
    }

    public boolean addMoney(double amount,String note){
        balance += amount;
        addTransactions("Credit",amount,note);
        return true;
    }
    //Task: Create check given no of transactions
    public void fetchTransactions( int page, int limit ){
      int skip = (page-1)*limit;
      // (8 -1) x 10 = 70
      System.out.println("---Statement for "+ name + "---");
      if(transactionCount == 0){
          System.out.println("No transaction Found");
      }
      int  dataIndex =  Math.min((skip+limit),transactionCount);
      for(int i = skip; i<dataIndex ; i++){
          if( i > transactions.length && i > transactionCount )
          {
              System.out.println("No transaction available");
              return;
          }

          System.out.println(transactions[i].getRecord());
      }
    }
    public void addTransactions( String type , double amount, String note){
        if(transactionCount >= transactions.length)
        {
            increaseSize();
        }
        Transaction t = new Transaction(type,amount,balance,note);
        transactions[transactionCount] = t;
        transactionCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean pay(double amount,String note){
        if(balance >= amount){
            balance -= amount;

            addTransactions("Debit",amount,note);
            return true;
        }
        addTransactions("Failed",amount,note);
        return false;
    }
    public void increaseSize(){
        int newTransactionSize = transactionSize + transactionSize/2;
        Transaction[] temp = new Transaction[newTransactionSize];
        for(int i=0; i< transactionSize;i++){
            temp[i] = transactions[i];
        }

//     transactions = Arrays.copyOf(transactions,newTransactionSize);
        transactions = temp;
    }

    //addTransaction
    //credit debit failed store in arraylist

    public void searchByType(String type){
        type =type.toLowerCase();

        for(int i = 0;i<transactionCount;i++){
            if(transactions[i].getRecord().toLowerCase().contains(type)){
                System.out.println(transactions[i].getRecord());
            }
        }
    }

}

//transaction claSS
//amount
//type
//balance
//note