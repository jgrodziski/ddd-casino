package ddd.casino.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class GameDefinition {

    public static GameDefinition DEFAULT = new GameDefinition();

    private List<Credit> bets = new ArrayList<Credit>(Arrays.asList(new Credit[]{new Credit(1), new Credit(5), new Credit(10)}));
    private Credit maxGain;
    private PTable ptable;

    public boolean isAuthorized(Credit bet) {
        return bets.contains(bet);
    }

}
