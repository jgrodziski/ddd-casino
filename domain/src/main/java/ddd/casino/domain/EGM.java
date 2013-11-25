package ddd.casino.domain;

/**
 *
 */
public class EGM {
    private Denomination denomination;

    public EGM(Denomination denomination) {
        this.denomination = denomination;
    }

    public Denomination getDenomination() {
        return denomination;
    }
}
