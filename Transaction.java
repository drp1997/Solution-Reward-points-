import java.util.Date;

public class Transaction {
    public Transaction(int price) {
        this.price = price;
        this.reward = calculateRewards(price);
        this.transactionDate = new Date();
    }

    private int calculateRewards(int price) {
        if (price >= 50 && price < 100) {
            return price - 50;
        } else {
            return (2 * (price - 100) + 50);
        }
    }

    public int price;
    public int reward;
    public Date transactionDate = new Date();
}
