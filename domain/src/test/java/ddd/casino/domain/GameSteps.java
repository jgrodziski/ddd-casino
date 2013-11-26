package ddd.casino.domain;

import com.google.common.collect.Lists;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;


public class GameSteps {
    private Game game;
    private Credit creditWon;

    @Given("a game with 3 symbols (Star, Club, Treasure)")
    @Pending
    public void givenAGameWith3SymbolsStarClubTreasure() {
        List<Combination> gameCombinations = new ArrayList<Combination>();
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.TREASURE, GameSymbol.TREASURE, GameSymbol.TREASURE), new GainFactor(20)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.CLUB, GameSymbol.CLUB, GameSymbol.CLUB), new GainFactor(50)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.STAR, GameSymbol.STAR, GameSymbol.STAR), new GainFactor(100)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.STAR, GameSymbol.CLUB, GameSymbol.CLUB), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.STAR, GameSymbol.CLUB, GameSymbol.TREASURE), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.STAR, GameSymbol.TREASURE, GameSymbol.STAR), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.STAR, GameSymbol.TREASURE, GameSymbol.CLUB), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.TREASURE, GameSymbol.STAR, GameSymbol.STAR), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.TREASURE, GameSymbol.STAR, GameSymbol.CLUB), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.CLUB, GameSymbol.TREASURE, GameSymbol.STAR), new GainFactor(0)));
        gameCombinations.add(new Combination(Lists.newArrayList(GameSymbol.CLUB, GameSymbol.STAR, GameSymbol.STAR), new GainFactor(0)));

        this.game = new Game(new GameDefinition(new ArrayList<Credit>(), new Credit(50), new PTable(gameCombinations)));
    }

    @When("the game hits 3 star")
    @Pending
    public void whenTheGameHits3Star() {
        creditWon = this.game.play(new Credit(1));
    }

    @Then("it gives back 100 times the credits bet")
    @Pending
    public void thenItGivesBack100TimesTheCreditsBet() {
        Credit hundredCredits = new Credit(100);
        MatcherAssert.assertThat(creditWon, equalTo(hundredCredits));
    }

    @When("the game hits 3 club")
    @Pending
    public void whenTheGameHits3Club() {
        // PENDING
    }

    @Then("it gives back 50 times the credits bet")
    @Pending
    public void thenItGivesBack50TimesTheCreditsBet() {
        // PENDING
    }

    @When("the game hits 3 treasures")
    @Pending
    public void whenTheGameHits3Treasures() {
        // PENDING
    }

    @Then("it gives back 20 times the credits bet")
    @Pending
    public void thenItGivesBack20TimesTheCreditsBet() {
        // PENDING
    }

    @When("the game hits any other combination")
    @Pending
    public void whenTheGameHitsAnyOtherCombination() {
        // PENDING
    }

    @Then("it gives back 0 credits")
    @Pending
    public void thenItGivesBack0Credits() {
        // PENDING
    }


}
