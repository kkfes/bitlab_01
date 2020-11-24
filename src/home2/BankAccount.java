package home2;

public class BankAccount {
     int numberCard;
     int cvv;
     String name;
     String surname;
     double balance;
     int coin;
     int card;

    public BankAccount() {
    }

    public BankAccount(int numberCard, int cvv, String name, String surname, double balance, int coin, int card) {
        this.numberCard = numberCard;
        this.cvv = cvv;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.coin = coin;
        this.card = card;
    }
    public void upHome(int cost){
        balance = balance + cost;
        card = card - cost;
    }

    public void cardGet(int get){ ;
        card = card - get + get/2;
    }
    public void cardBankUp(int up){
        card = card += up;
        balance = balance -= up;
    }
    public void cardUp(int up){
        card = card += up -= up/=2;
    }
    public void upCard(int give){
        card = card += give;
    }

    public void getCoin(int get){
        coin = coin -= get;
    }
    public void upCoin(int give){
        coin = coin += give;
    }

    public void getBalance(int get) {
        balance = balance -= get;
    }
    public void upBalance(int give) {
        balance = balance += give;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberCard=" + numberCard +
                ", cvv=" + cvv +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", coin=" + coin +
                ", card=" + card +
                '}';
    }
}
