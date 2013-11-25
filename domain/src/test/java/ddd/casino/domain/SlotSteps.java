package ddd.casino.domain;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.math.BigDecimal;
import java.util.Currency;

public class SlotSteps {

    @Given("an available EGM (Electronic Game Machine) with a denomination of $denominationValue $denomCurrency and no active session")
    @Pending
    public void givenAnAvailableEGMElectronicGameMachineWithADenominationOf05€AndNoActiveSession(String denominationValue, String denomCurrency) {
        System.out.println("I'm in");
        Denomination denomination = new Denomination(new BigDecimal(denominationValue), Currency.getInstance(denomCurrency));
        EGM egm = new EGM(denomination);
    }

    @When("the player inserts a bill of 20 \u20AC")
    @Pending
    public void whenThePlayerInsertsABillOf20€() {
        // PENDING
    }

    @Then("a new session is started")
    @Pending
    public void thenANewSessionIsStarted() {
        // PENDING
    }

    @Then("the EGM has an increment 40 credits")
    @Pending
    public void thenTheEGMHasAnIncrement40Credits() {
        // PENDING
    }

    @When("the player bets 1 credit")
    @Pending
    public void whenThePlayerBets1Credit() {
        // PENDING
    }

    @Then("the EGM starts a game with a bet of 1 credit")
    @Pending
    public void thenTheEGMStartsAGameWithABetOf1Credit() {
        // PENDING
    }

    @Then("the EGM returns the game result")
    @Pending
    public void thenTheEGMReturnsTheGameResult() {
        // PENDING
    }
}
