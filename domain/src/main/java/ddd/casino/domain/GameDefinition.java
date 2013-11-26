package ddd.casino.domain;

import java.util.List;

/**
 *
 */
public class GameDefinition {
    private List<Credit> bets;
    private Credit maxGain;
    private PTable ptable;

    public GameDefinition(List<Credit> bets, Credit maxGain, PTable ptable)
    {
        this.bets = bets;
        this.maxGain = maxGain;
        this.ptable = ptable;
    }
}
