package ddd.casino.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rformation
 * Date: 26/11/13
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 */
public class Combination {
    private List<GameSymbol> gameSymbolList;

    public Combination(List<GameSymbol> winningSymbols, GainFactor gainFactor)
    {
        this.gameSymbolList = winningSymbols;
    }
}
