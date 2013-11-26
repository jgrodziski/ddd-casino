package ddd.casino.domain;

/**
 *
 */
public class EGM {
    private String brand;
    private String model;
    private EGMCode code;
    private Denomination denomination;
    private Credit balance;
    private Credit maxCreditBalance;

    public EGM(String brand, String model, Denomination denomination, EGMCode code) {
        this.brand = brand;
        this.model = model;
        this.code = code;
        this.denomination = denomination;
        this.balance = Credit.ZERO;
    }

    public EGMCode getCode() {
        return code;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public void insert(Bill bill) {
        balance = balance.add(denomination.convert(bill.getAmount()));
    }

    public Credit getBalance(){
        return balance;
    }
}
