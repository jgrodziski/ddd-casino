package ddd.casino.domain;

/**
 *
 */
public class Game {

    public static Game NO_GAME = new Game(Credit.ZERO);

    private Credit bet;

    public Game(Credit bet) {
        this.bet = bet;
    }

    public Game(Credit bet, GameDefinition gameDefinition) {
        if(!gameDefinition.isAuthorized(bet)) {
            throw new IllegalArgumentException("Bet not authorized");
        }
        this.bet = bet;
    }

    public Credit spin(){
        return new Credit(5);
    }

    public Credit getBet() {
        return bet;
    }
}
