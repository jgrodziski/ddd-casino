package ddd.casino.domain;


import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.math.BigDecimal;
import java.util.Currency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SlotSteps {
    EGM egm;

    @Given("an available EGM (Electronic Game Machine) with a denomination of $denominationValue $denomCurrency and no credits")
    public void givenAnAvailableEGMElectronicGameMachineWithADenominationOf05€AndNoActiveSession(String denominationValue, String denomCurrency) {
        System.out.println("I'm in");
        Denomination denomination = new Denomination(new BigDecimal(denominationValue), Currency.getInstance(denomCurrency));
        egm = new EGM(new EGMCode("CashFeve"), denomination);
    }

    @When("the player inserts a bill of $value $currency")
    public void whenThePlayerInsertsABillOf(String value, String currencyCode) {
        egm.insert(new Bill(new Amount(new BigDecimal(value), Currency.getInstance(currencyCode))));
    }

    @Then("the EGM has an increment 40 credits")
    public void thenTheEGMHasAnIncrement40Credits() {
        Credit fourtyCredits = new Credit(40);
        assertThat(egm.getBalance(), equalTo(fourtyCredits));
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
