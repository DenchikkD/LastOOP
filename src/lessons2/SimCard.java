package lessons2;

/**
 * Created by Denni on 13.05.2016.
 */
public class SimCard {
    private String operator;
    private Integer minuteCost;
    private Integer smsCost;
    private Integer balance;


    public SimCard(String operator, Integer minuteCost, Integer smsCost) {
        this.operator = operator;
        this.minuteCost = minuteCost;
        this.smsCost = smsCost;
        balance = 0;

    }

    public void setBalance(Integer balance) {
        if (balance > 0) {
            this.balance += balance;
        }
    }
    public void callBalance(Integer balance){
        this.balance=balance;
    }

    public String getOperator() {
        return operator;
    }

    public Integer getMinuteCost() {
        return minuteCost;
    }

    public Integer getSmsCost() {
        return smsCost;
    }

    public Integer getBalance() {
        return balance;
    }
}
