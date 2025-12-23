import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;

    private int tId = 0;
    private String type;
    private double amount;
    private double balanceAfter;
    private String note;
    private LocalDateTime createdAt;

    public Transaction(String type, double amount, double balanceAfter, String note) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.note = note;
        this.tId = counter++;
        createdAt = LocalDateTime.now();
    }


    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.tId = counter++;
        createdAt = LocalDateTime.now();
    }
    public String getRecord(){
        return createdAt + " | " + type + " | " + amount +" |Balance "
                + balanceAfter + " | Note "+ note;
    }
}
