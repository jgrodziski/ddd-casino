package ddd.casino.domain;

/**
 *
 */
public class EGM {
    private EGMCode code;
    private Denomination denomination;
    private Credit balance;

    public EGM(EGMCode code, Denomination denomination) {
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
