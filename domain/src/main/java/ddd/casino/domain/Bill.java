package ddd.casino.domain;

/**
 *
 */
public class Bill {

    private Amount amount;

    public Bill(Amount amount) {
        this.amount = amount;
    }

    public Amount getAmount() {
        return amount;
    }
}
