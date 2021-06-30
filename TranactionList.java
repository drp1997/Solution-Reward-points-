import java.util.ArrayList;
import java.util.List;

public class TranactionList {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(addTransaction(120));
        getTotalRewards(transactionList);

    }

    private static void getTotalRewards(List<Transaction> transactionList) {
        if (transactionList.size() > 0) {
            transactionList.stream().forEach(action -> {
                System.out.println(action.reward);
            });
        }
    }

    private static Transaction addTransaction(int price) {
        return new Transaction(price);

    }
}
