import java.time.LocalDateTime;
import java.util.SplittableRandom;

public class transactions {
    int tid;
    int idCount = 0;
    double amt;
    double balanceAfter;
    String type;
    String note;
    LocalDateTime CreatedAt;


    transactions(double amt, double balance, String type){
        this.amt = amt;
        this.balanceAfter = balance;
        this.type = type;
        this.note = "";
        this.tid = idCount;
        idCount++;
        CreatedAt = LocalDateTime.now();
    }

    transactions(double amt, double balance, String type, String note){
        this.amt = amt;
        this.balanceAfter = balance;
        this.type = type;
        this.note = note;
        this.tid = idCount;
        idCount++;
        CreatedAt = LocalDateTime.now();
    }


    String getRecord(){
        if(note != ""){
            return "Created at:\t" + CreatedAt + " | Amount:\t" + amt + " | Balance After:\t" + balanceAfter + " | Type:\t" + type + " | Note:\t" + note;
        }else{
            return "Created at:\t" + CreatedAt + " | Amount:\t" + amt + " | Balance After:\t" + balanceAfter + " | Type:\t" + type;
        }

    }
}
