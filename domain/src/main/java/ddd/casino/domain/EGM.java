package ddd.casino.domain;

/**
 *
 */
public class EGM {
    private String brand;
    private String model;
    private EGMCode code;
    private Denomination denomination;
    private Credit maxCreditBalance;
    private Integer nextBetSuccessCredit;
    private boolean blocked;

    private GameDefinition gameDefinition;

    private Credit balance;
    private Game currentGame;

    public EGM(String brand, String model, Denomination denomination, EGMCode code) {
        this.brand = brand;
        this.model = model;
        this.code = code;
        this.denomination = denomination;
        this.balance = Credit.ZERO;
        this.currentGame = Game.NO_GAME;
        this.gameDefinition = GameDefinition.DEFAULT;
    }

    public boolean isBlocked() {
        return blocked;
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

    public void forceSuccess(Integer credit) {
        nextBetSuccessCredit=credit;
    }

    public void bet(Credit bet) {
        balance = balance.minus(bet);
        currentGame = new Game(bet, gameDefinition);
    }

    public Credit spin() {
        Credit gain = currentGame.spin();
        balance = balance.add(gain);
        return gain;
    }

    public Credit getBet() {
        return currentGame.getBet();
    }
}
